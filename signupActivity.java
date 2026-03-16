package com.example.myaeontogo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class signupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnRegister = findViewById(R.id.btn_signup_submit);

        btnRegister.setOnClickListener(v -> {
            Toast.makeText(this, "Account Created (Local Test)", Toast.LENGTH_SHORT).show();
            finish(); // Goes back to Login screen
        });
    }
}
