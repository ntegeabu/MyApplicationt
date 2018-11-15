package com.example.ntege.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

import static android.view.View.Y;

public class MainActivity extends AppCompatActivity {
public String editText1;
    public String editText2;
    public String textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  button = findViewById(R.id.button1);
        final EditText editText1 =findViewById(R.id.editTextFirstName);
        final EditText editText2 = findViewById(R.id.editText2);
        final TextView textView  = findViewById(R.id.textView1);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(editText1.getText().toString()+editText2.getText().toString());

                    }
                }
        );

    }


    public void sendMessage(View view) {
        Intent i= new Intent(this,Main2Activity.class);
        startActivity(i);
    }

    public void doe(View view) {
        Intent i= new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:1°04'50.0\"N, 34°10'30.0\"E "));
        startActivity(i);


    }

    public void video(View view) {



    }
}
