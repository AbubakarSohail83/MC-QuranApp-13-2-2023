package com.example.quranapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mainViewAdapter extends RecyclerView.Adapter<mainViewAdapter.mainViewHolder> {
    @NonNull
    @Override

    public mainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull mainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class mainViewHolder extends RecyclerView.ViewHolder{
        public mainViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
