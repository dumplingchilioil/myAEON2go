package com.myaeon2go;

public class Product {

    String name;
    String category;
    String expiryDate;
    int image;

    public Product(String name, String category, String expiryDate, int image) {
        this.name = name;
        this.category = category;
        this.expiryDate = expiryDate;
        this.image = image;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getExpiryDate() { return expiryDate; }
    public int getImage() { return image; }

}
