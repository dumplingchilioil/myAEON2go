package com.example.myaeon2go;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private final List<Order> orderList;

    public OrderAdapter(List<Order> orderList) {
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_order, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        Order order = orderList.get(position);
        holder.txtOrderId.setText("Order ID: " + order.getOrderId());
        holder.txtOrderDate.setText(order.getOrderDate());
        holder.txtOrderItems.setText(order.getOrderItems());
        holder.txtOrderAmount.setText(order.getTotalAmount());
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    static class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView txtOrderId, txtOrderDate, txtOrderItems, txtOrderAmount;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            txtOrderId = itemView.findViewById(R.id.txt_order_id);
            txtOrderDate = itemView.findViewById(R.id.txt_order_date);
            txtOrderItems = itemView.findViewById(R.id.txt_order_items);
            txtOrderAmount = itemView.findViewById(R.id.txt_order_amount);
        }
    }
}
