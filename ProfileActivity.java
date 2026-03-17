package com.example.myaeon2go;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button btnViewOrders = findViewById(R.id.btn_view_orders);
        Button btnLogout = findViewById(R.id.btn_logout);

        btnViewOrders.setOnClickListener(v ->
                startActivity(new Intent(ProfileActivity.this, OrderHistoryActivity.class)));

        btnLogout.setOnClickListener(v -> finishAffinity());
    }
}
