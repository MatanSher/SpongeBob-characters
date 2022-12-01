package com.journaldev.recyclerviewcardview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {

    private ArrayList<DataModel> dataSet;

    public CustomAdapter(ArrayList<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        CardView cardView;
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyViewHolder (View itemView )
        {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.card_view);
            textViewName = ( TextView) itemView.findViewById(R.id.textViewName);
            textViewVersion = ( TextView) itemView.findViewById(R.id.textViewVersion);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);


        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.cards_layout , parent ,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int listPosition) {

        holder.textViewName.setText(dataSet.get(listPosition).getName());
        holder.textViewVersion.setText(dataSet.get(listPosition).getVersion());
        holder.imageViewIcon.setImageResource(dataSet.get(listPosition).getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Activity_one.class);
                intent.putExtra("name",dataSet.get(listPosition).getName());
                intent.putExtra("id",dataSet.get(listPosition).getId());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}

