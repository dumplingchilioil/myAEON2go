package com.myaeon2go;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myaeon2go.LoginActivity;
import com.example.myaeon2go.R;

public class ProfileActivity extends AppCompatActivity {

    private TextView txtEmail, txtPhone, txtDob, txtGender, txtRace;
    private Button btnChangeEmail, btnChangePhone, btnViewOrders, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile); // Make sure layout name matches

        // Initialize views
        txtEmail = findViewById(R.id.txt_email);
        txtPhone = findViewById(R.id.txt_phone);
        txtDob = findViewById(R.id.txt_dob);
        txtGender = findViewById(R.id.txt_gender);
        txtRace = findViewById(R.id.txt_race);

        btnChangeEmail = findViewById(R.id.btn_change_email);
        btnChangePhone = findViewById(R.id.btn_change_phone);
        btnViewOrders = findViewById(R.id.btn_view_orders);
        btnLogout = findViewById(R.id.btn_logout);

        // Load sample data
        txtEmail.setText("example@email.com");
        txtPhone.setText("+60 123 456 789");
        txtDob.setText("01/01/1990");
        txtGender.setText("Male");
        txtRace.setText("Malay");

        // Button actions
        btnChangeEmail.setOnClickListener(v ->
                Toast.makeText(this, "Change Email clicked", Toast.LENGTH_SHORT).show());

        btnChangePhone.setOnClickListener(v ->
                Toast.makeText(this, "Change Phone clicked", Toast.LENGTH_SHORT).show());

        btnViewOrders.setOnClickListener(v ->
                startActivity(new Intent(ProfileActivity.this, OrderHistoryActivity.class)));

        btnLogout.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences("MyAEONPrefs", MODE_PRIVATE);
            prefs.edit().clear().apply();
            Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
        return null;
    }
}
