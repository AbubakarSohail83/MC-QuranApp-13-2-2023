package com.example.quranapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mainViewAdapter extends RecyclerView.Adapter<mainViewAdapter.mainViewHolder> {

    /* Adapter class is made to adapt the data provided by the data source into the view holder class */
    private String[] data;
    public mainViewAdapter(String [] data)   //constructor
    {
        this.data=data;
    }




    @NonNull
    @Override

    public mainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //It will create view holder and store views in them
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull mainViewHolder holder, int position) { //this method will bind the views with data

    }

    @Override
    public int getItemCount() {     //tells the count of data in recycler View's Adapter
        return data.length;
    }

    public class mainViewHolder extends RecyclerView.ViewHolder{
        public mainViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
