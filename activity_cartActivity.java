package com.example.myaeontogo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class cartActivity extends AppCompatActivity {

    private ArrayList<CartItem> cartList;
    private CartAdapter adapter;
    private TextView tvTotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // Initialize UI
        tvTotalPrice = findViewById(R.id.tv_totalprice);
        RecyclerView rv = findViewById(R.id.rv_cart_items);
        Button btnCheckout = findViewById(R.id.btn_checkout);
        ImageButton btnBack = findViewById(R.id.btnBackCart);

        // CRUD: 'Read' / Initialize Data
        cartList = new ArrayList<>();
        cartList.add(new CartItem("Chips Ahoy! Original", 7.50, 1));
        cartList.add(new CartItem("Fresh Milk 1L", 5.00, 1));

        // Setup Adapter with a listener to update total price when CRUD happens
        adapter = new CartAdapter(cartList, this::calculateTotal);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        calculateTotal();

        // Navigation: Back to Home
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(cartActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        // Navigation: To Payment
        btnCheckout.setOnClickListener(v -> {
            Intent intent = new Intent(cartActivity.this, paymentActivity.class);
            startActivity(intent);
        });
    }

    public void calculateTotal() {
        double total = 0;
        for (CartItem item : cartList) {
            total += (item.getPrice() * item.getQuantity());
        }
        tvTotalPrice.setText("RM " + String.format("%.2f", total));
    }
}
