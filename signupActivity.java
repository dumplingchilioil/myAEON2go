package com.example.myaeontogo;

import android.content.Intent;
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

        // REGISTER ACTION: Navigate to Home Page (MainActivity)
        btnRegister.setOnClickListener(v -> {

            Toast.makeText(this, "Account Created Successfully!", Toast.LENGTH_SHORT).show();

            // Navigate directly to Home (MainActivity) after register
            Intent intent = new Intent(signupActivity.this, MainActivity.class);
            startActivity(intent);

            // finish() closes the signup activity so it's removed from the backstack
            finish();
        });
    }
}
