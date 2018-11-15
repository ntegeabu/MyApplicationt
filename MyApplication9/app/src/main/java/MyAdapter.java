import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ntege.myapplication.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListItem>listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder( ViewHolder Holder, int position) {
        ListItem listItem =listItems.get(position);
        Holder.textViewHead.setText(listItem.getHead());
        Holder.textViewDesc.setText(ListItem.getDesc());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;

        public ViewHolder( View itemView) {
            super(itemView);
            textViewHead =(TextView) itemView.findViewById(R.id.textviewHead);
            textViewDesc =(TextView) itemView.findViewById(R.id.textviewDesc);
        }
    }
}
