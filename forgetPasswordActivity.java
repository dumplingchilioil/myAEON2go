package com.example.myaeontogo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class forgetPasswordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        Button btnReset = findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(v -> Toast.makeText(this, "Reset link 'sent' to your email!", Toast.LENGTH_SHORT).show());
    }
}
