package com.example.myaeon2go;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Buttons
        View btnViewProfile = findViewById(R.id.btn_view_profile);
        View btnOrderHistory = findViewById(R.id.btn_order_history);
        View btnLogout = findViewById(R.id.btn_logout);

        btnViewProfile.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, ProfileActivity.class)));

        btnOrderHistory.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, OrderHistoryActivity.class)));

        btnLogout.setOnClickListener(v -> finishAffinity());
    }
}
