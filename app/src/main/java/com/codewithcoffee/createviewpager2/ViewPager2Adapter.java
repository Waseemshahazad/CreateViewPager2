package com.codewithcoffee.createviewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewPager2Adapter extends RecyclerView.Adapter<ViewPager2Adapter.ViewHolder> {

    private ArrayList<PicModel> picModels;
    private Context context;

    public ViewPager2Adapter(ArrayList<PicModel> picModels, Context context) {
        this.picModels = picModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.images_holder,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageHolder.setImageResource(picModels.get(position).getPic());
    }

    @Override
    public int getItemCount() {
        return picModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageHolder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageHolder = itemView.findViewById(R.id.imageHolder);
        }
    }
}
