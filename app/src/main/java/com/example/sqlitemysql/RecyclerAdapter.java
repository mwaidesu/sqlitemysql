package com.example.sqlitemysql;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sqlitemysql.model.Contact;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder > {

    private ArrayList<Contact> arrayList;
//    Context context;

    public RecyclerAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
//        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Name.setText(arrayList.get(position).getName());
        int sync_status = arrayList.get(position).getSync_status();

        if(sync_status == DbContract.SYNC_STATUS_OK){
            holder.Sync_status.setImageResource(R.drawable.ic_done);
        }
        else{
            holder.Sync_status.setImageResource(R.drawable.ic_sync);
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView Sync_status;
        TextView Name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Sync_status = itemView.findViewById(R.id.imgSync);
            Name = itemView.findViewById(R.id.txtName);
        }
    }
}
