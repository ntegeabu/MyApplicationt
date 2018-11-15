package com.example.ntege.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String[] Countries= new String[]{
        "Kenya",
        "uganda",
        "Tanzania"

};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView k =findViewById(R.id.Name);
        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,Countries);
        k.setAdapter(adapter);
        k.OnItemClickListener( new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Postion:" + position+Countries[position],Toast.LENGTH_LONG ).show();
            }
        });


    }
}
