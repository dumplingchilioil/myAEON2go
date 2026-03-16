package com.example.myaeontogo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class cartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        RecyclerView rv = findViewById(R.id.rv_cart_items);
        Button btnCheckout = findViewById(R.id.btn_checkout);

        // Dummy Data for your list
        ArrayList<String> items = new ArrayList<>();
        items.add("Chips Ahoy! Original");
        items.add("Fresh Milk 1L");

        CartAdapter adapter = new CartAdapter(items);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        btnCheckout.setOnClickListener(v -> startActivity(new Intent(this, paymentActivity.class)));

        Button btncheckout = findViewById(R.id.btn_checkout);

        btncheckout.setOnClickListener(v -> {
            Intent intent = new Intent(cartActivity.this, paymentActivity.class);
            startActivity(intent);
        });
    }
}
