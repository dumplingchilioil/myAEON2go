package com.myaeon2go;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    ImageView image;
    TextView name, expiry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        image = findViewById(R.id.detailImage);
        name = findViewById(R.id.detailName);
        expiry = findViewById(R.id.detailExpiry);

        name.setText(getIntent().getStringExtra("name"));
        expiry.setText("Expiry Date: " + getIntent().getStringExtra("expiry"));
        image.setImageResource(getIntent().getIntExtra("image",0));
    }
}
