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

        btnLogin.setOnClickListener(v -> {
            String email = emailEt.getText().toString();
            String pass = passEt.getText().toString();

            // Simple check: If not empty, go to Profile
            if(!email.isEmpty() && !pass.isEmpty()) {
                Intent intent = new Intent(loginActivity.this, viewProfileActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Please enter any email and password", Toast.LENGTH_SHORT).show();
            }
        });

        tvForgot.setOnClickListener(v -> startActivity(new Intent(this, forgetPasswordActivity.class)));
        tvSignUp.setOnClickListener(v -> startActivity(new Intent(this, signupActivity.class)));
    }
}
