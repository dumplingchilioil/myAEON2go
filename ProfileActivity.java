package com.example.myaeon2go;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        LinearLayout viewProfile = findViewById(R.id.btn_view_profile);
        LinearLayout orderHistory = findViewById(R.id.btn_order_history);
        LinearLayout logout = findViewById(R.id.btn_logout);

        // Click listeners
        viewProfile.setOnClickListener(v -> {
            // You can start a Profile Details Activity if you have one
        });

        orderHistory.setOnClickListener(v ->
                startActivity(new Intent(ProfileActivity.this, OrderHistoryActivity.class)));

        logout.setOnClickListener(v -> finishAffinity()); // close all activities to logout
    }
}
