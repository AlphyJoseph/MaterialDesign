package com.example.alphyjoseph.myapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alphy Joseph on 9/25/2016.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Item_ViewHolder> {
    ArrayList<Items>items=new ArrayList<Items>();

    public ItemAdapter(ArrayList<Items> items)
    {
        this.items=items;
    }

    @Override
    public Item_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        Item_ViewHolder item_viewHolder= new Item_ViewHolder(view);
        return item_viewHolder;

    }

    @Override
    public void onBindViewHolder(Item_ViewHolder holder, int position) {
           Items ITM=items.get(position);
            holder.img.setImageResource(ITM.getImage_id());
            holder.name1.setText(ITM.getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class Item_ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView name1;
        public Item_ViewHolder(View view)
        {
            super(view);
            img=(ImageView)view.findViewById(R.id.img1);
            name1=(TextView)view.findViewById(R.id.name);
        }

    }
}
