package com.example.home1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PointsActivity extends AppCompatActivity {

    TextView txtPoints;
    ProgressBar progressBar;
    ImageView btnBack;

    int userPoints = 350; // 🔥 You can change this (or load from database later)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        txtPoints = findViewById(R.id.txtPoints);
        progressBar = findViewById(R.id.progressBar);
        btnBack = findViewById(R.id.btnBack);

        // Set points
        txtPoints.setText(String.valueOf(userPoints));

        // Update progress (max = 1000)
        progressBar.setProgress(userPoints);

        // Back button
        btnBack.setOnClickListener(v -> finish());
    }
}