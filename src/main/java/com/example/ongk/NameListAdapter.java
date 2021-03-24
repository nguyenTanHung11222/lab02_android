package com.example.ongk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {


    private LayoutInflater layoutInflater;
    private ArrayList <String> nameArraylist;
    public NameListAdapter(Context context, ArrayList<String> nameArraylist) {
        layoutInflater =  LayoutInflater.from(context);
        this.nameArraylist = nameArraylist;
    }
    @NonNull
    @Override
    public NameListAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.namelist_item ,parent ,false);
        return new NameViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull NameListAdapter.NameViewHolder holder, int position) {
        String mCurrent = nameArraylist.get(position);
        holder.nameItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return nameArraylist.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {
        public TextView nameItemView;
        NameListAdapter nameListAdapter;
        public NameViewHolder(@NonNull View itemView,NameListAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.tvName);
            this.nameListAdapter = adapter;
        }
    }
}
