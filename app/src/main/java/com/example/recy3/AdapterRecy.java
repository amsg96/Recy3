package com.example.recy3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class AdapterRecy extends RecyclerView.Adapter<AdapterRecy.ViewHolder> {

    List<Model> item;
    Context context;

    public AdapterRecy(List<Model> item, Context context) {
        this.item = item;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model model = item.get(position);
        holder.img_show.setImageResource(model.getImage());
        holder.txt.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_show, img_remove;
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_show = itemView.findViewById(R.id.img_show);
            img_remove = itemView.findViewById(R.id.img_remove);
            txt = itemView.findViewById(R.id.txt);


        }
    }
}
