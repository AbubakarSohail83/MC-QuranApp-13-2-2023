package com.example.quranapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mainViewAdapter extends RecyclerView.Adapter<mainViewAdapter.mainViewHolder> {

    /* Adapter class is made to adapt the data provided by the data source into the view holder class */
    private ArrayList data=new ArrayList<String>();
    public mainViewAdapter(ArrayList data)   //constructor
    {
        this.data=data;
    }




    @NonNull
    @Override

    public mainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //It will create view holder and store views in them, whenever recycler view will be created this function will be called
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //creating a view with inflater
        View view= inflater.inflate(R.layout.list_item_layout, parent, false);

        return new mainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mainViewHolder holder, int position) { //this method will bind the views with data
        holder.txtParaName.setText((String)data.get(position));
    }

    @Override
    public int getItemCount() {     //tells the count of data in recycler View's Adapter
        return data.size();
    }

    public class mainViewHolder extends RecyclerView.ViewHolder{
        TextView txtParaName;
        public mainViewHolder(@NonNull View itemView) {
            super(itemView);
            txtParaName= (TextView) itemView.findViewById(R.id.textViewParaName);
        }
    }
}
