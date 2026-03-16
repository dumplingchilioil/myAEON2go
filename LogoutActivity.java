package com.example.myaeon2go;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogoutActivity extends AppCompatActivity {

    Button btnLogout, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        btnLogout = findViewById(R.id.btnLogout);
        btnCancel = findViewById(R.id.btnCancel);

        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(LogoutActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        btnCancel.setOnClickListener(v -> finish());
    }
}
