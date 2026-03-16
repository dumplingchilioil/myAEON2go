package com.example.myaeon2go;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class OrderHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewOrders);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Add sample orders
        // orderId as String
        // date
        // items as single String
        // totalAmount as String
        List<Order> orders = Arrays.asList(
                new Order(
                        "12345", // orderId as String
                        "16-03-2026", // date
                        "Item 1 x2, Item 2 x1", // items as single String
                        "RM120.00" // totalAmount as String
                ),
                new Order(
                        "12346",
                        "15-03-2026",
                        "Item 3 x1, Item 4 x4",
                        "RM200.50"
                ),
                new Order(
                        "12347",
                        "14-03-2026",
                        "Item 5 x2",
                        "RM75.00"
                )
        );

        // Initialize adapter
        OrderAdapter orderAdapter = new OrderAdapter(orders);
        recyclerView.setAdapter(orderAdapter);
    }
}
