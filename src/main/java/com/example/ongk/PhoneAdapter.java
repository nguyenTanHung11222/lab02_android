package com.example.ongk;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ThingViewHolder> {
    @NonNull
    @Override
    public PhoneAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneAdapter.ThingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ThingViewHolder {
    }
}
