package com.example.home1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    Button button1, button2, button3, button4, button5, button6;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // =========================
        // Bottom Navigation
        // =========================
        bottomNav = findViewById(R.id.bottomNavigation);

        bottomNav.setOnItemSelectedListener(item -> {

            int id = item.getItemId();

            if (id == R.id.first_fragment) {
                return true;
            }
            else if (id == R.id.second) {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
                return true;
            }
            else if (id == R.id.third) {
                startActivity(new Intent(MainActivity.this, ScanActivity.class));
                return true;
            }
            else if (id == R.id.four) {
                startActivity(new Intent(MainActivity.this, CartActivity.class));
                return true;
            }
            else if (id == R.id.five) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                return true;
            }

            return false;
        });

        // =========================
        // Buttons (Main Features)
        // =========================
        button1 = findViewById(R.id.button1); // Store
        button2 = findViewById(R.id.button2); // Aeon Brand
        button3 = findViewById(R.id.button3); // More
        button4 = findViewById(R.id.button4); // Discount
        button5 = findViewById(R.id.button5); // Wishlist
        button6 = findViewById(R.id.button6); // Points

        // Store Location
        button1.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, StoreActivity.class)));

        // AEON Brand
        button2.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AeonActivity.class)));

        // More
        button3.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, MoreActivity.class)));

        // Discount Page
        button4.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, DiscountActivity.class)));

        // Wishlist Page
        button5.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, WishActivity.class)));

        // ⭐ Points Page (IMPORTANT)
        button6.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, PointsActivity.class)));
    }
}