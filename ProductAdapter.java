package com.myaeon2go;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{

    Context context;
    ArrayList<Product> list;

    public ProductAdapter(Context context, ArrayList<Product> list){
        this.context = context;
        this.list = list;
    }

    public void updateList(ArrayList<Product> newList){
        list = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context)
                .inflate(R.layout.product_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        Product product = list.get(position);

        holder.name.setText(product.getName());
        holder.category.setText(product.getCategory());
        holder.image.setImageResource(product.getImage());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ProductDetailActivity.class);
            intent.putExtra("name",product.getName());
            intent.putExtra("expiry",product.getExpiryDate());
            intent.putExtra("image",product.getImage());
            context.startActivity(intent);
        });

        holder.addCart.setOnClickListener(v -> {
            CartManager.cartList.add(product);
            Toast.makeText(context,"Added to cart",Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount(){ return list.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,category;
        Button addCart;

        public ViewHolder(View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.productImage);
            name = itemView.findViewById(R.id.productName);
            category = itemView.findViewById(R.id.productCategory);
            addCart = itemView.findViewById(R.id.btnAddCart);
        }
    }
}
