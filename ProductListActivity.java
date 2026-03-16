package com.myaeon2go;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> productList = new ArrayList<>();
    SearchView searchView;
    androidx.appcompat.widget.AppCompatSpinner filterSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        recyclerView = findViewById(R.id.recyclerProducts);
        searchView = findViewById(R.id.searchProducts);
        filterSpinner = findViewById(R.id.spinnerCategory);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        loadProducts();

        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);

        // Search
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) { return false; }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

        // Category filter
        String[] categories = {"All","Drink","Dairy","Snack"};
        ArrayAdapter<String> spinnerAdapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        categories);
        filterSpinner.setAdapter(spinnerAdapter);

        filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                String selected = categories[position];

                if(selected.equals("All"))
                    adapter.updateList(productList);
                else{
                    ArrayList<Product> filtered = new ArrayList<>();
                    for(Product p : productList)
                        if(p.getCategory().equals(selected))
                            filtered.add(p);
                    adapter.updateList(filtered);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    private void loadProducts(){

        // DRINK
        productList.add(new Product("Mineral Water","Drink","20/12/2027",R.drawable.water));
        productList.add(new Product("Orange Juice","Drink","15/08/2026",R.drawable.juice));
        productList.add(new Product("Apple Juice","Drink","10/11/2026",R.drawable.apple_juice));
        productList.add(new Product("Soda Can","Drink","01/12/2026",R.drawable.soda));
        productList.add(new Product("Energy Drink","Drink","05/09/2026",R.drawable.energy_drink));

        // DAIRY
        productList.add(new Product("Fresh Milk","Dairy","12/09/2026",R.drawable.milk));
        productList.add(new Product("Yogurt","Dairy","20/10/2026",R.drawable.yogurt));
        productList.add(new Product("Cheese","Dairy","15/11/2026",R.drawable.cheese));
        productList.add(new Product("Butter","Dairy","25/09/2026",R.drawable.butter));
        productList.add(new Product("Cream","Dairy","30/10/2026",R.drawable.cream));

        // SNACK
        productList.add(new Product("Chocolate Bar","Snack","10/10/2026",R.drawable.chocolate));
        productList.add(new Product("Cookies","Snack","05/11/2026",R.drawable.cookies));
        productList.add(new Product("Chips","Snack","15/09/2026",R.drawable.chips));
        productList.add(new Product("Candy","Snack","01/12/2026",R.drawable.candy));
        productList.add(new Product("Nuts","Snack","20/08/2026",R.drawable.nuts));
    }

    private void filter(String text){
        ArrayList<Product> filtered = new ArrayList<>();
        for(Product p : productList){
            if(p.getName().toLowerCase().contains(text.toLowerCase()))
                filtered.add(p);
        }
        adapter.updateList(filtered);
    }
}
