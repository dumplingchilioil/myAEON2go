package com.example.myaeontogo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {

    private EditText emailEt, passEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEt = findViewById(R.id.editTextTextEmailAddress2);
        passEt = findViewById(R.id.et_login_password);
        Button btnLogin = findViewById(R.id.button);
        TextView tvForgot = findViewById(R.id.textView3);
        TextView tvSignUp = findViewById(R.id.textView4);

        // LOGIN ACTION: Navigate to Home Page (MainActivity)
        btnLogin.setOnClickListener(v -> {
            String email = emailEt.getText().toString().trim();
            String pass = passEt.getText().toString().trim();

            if(!email.isEmpty() && !pass.isEmpty()) {
                // Navigate to MainActivity (Home)
                Intent intent = new Intent(loginActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            }
        });

        // Navigate to Forgot Password screen
        tvForgot.setOnClickListener(v -> startActivity(new Intent(this, forgetPasswordActivity.class)));

        // Navigate to Signup screen
        tvSignUp.setOnClickListener(v -> startActivity(new Intent(this, signupActivity.class)));
    }
}
