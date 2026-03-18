package com.example.home1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MoreActivity extends AppCompatActivity {

    ImageView btnBack;
    TextView btnSettings, btnHelp, btnAbout, btnTerms, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        btnBack = findViewById(R.id.btnBack);
        btnSettings = findViewById(R.id.btnSettings);
        btnHelp = findViewById(R.id.btnHelp);
        btnAbout = findViewById(R.id.btnAbout);
        btnTerms = findViewById(R.id.btnTerms);
        btnLogout = findViewById(R.id.btnLogout);

        // Back button
        btnBack.setOnClickListener(v -> finish());

        // Click actions (for now simple)
        btnSettings.setOnClickListener(v ->
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show());

        btnHelp.setOnClickListener(v ->
                Toast.makeText(this, "Help clicked", Toast.LENGTH_SHORT).show());

        btnAbout.setOnClickListener(v ->
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show());

        btnTerms.setOnClickListener(v ->
                Toast.makeText(this, "Terms clicked", Toast.LENGTH_SHORT).show());

        btnLogout.setOnClickListener(v ->
                Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show());
    }
}