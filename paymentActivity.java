package com.example.myaeontogo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class paymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button btnPlace = findViewById(R.id.btnPlaceOrder);
        btnPlace.setOnClickListener(v -> {
            Toast.makeText(this, "Order Confirmed! Thank you for shopping with AEON.", Toast.LENGTH_LONG).show();
            // Go back to the very start or profile
            finish();
        });
    }
}
