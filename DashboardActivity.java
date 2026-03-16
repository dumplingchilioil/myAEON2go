package com.example.myaeon2go;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        findViewById(R.id.btn_view_profile).setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, ProfileActivity.class)));

        findViewById(R.id.btn_order_history).setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, OrderHistoryActivity.class)));

        findViewById(R.id.btn_logout).setOnClickListener(v -> finish());
    }
}
