package com.example;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String productName;
    private double price;
    private int productId;

    public Product() {

    }

    public Product(String productName, double price, int productId) {
        this.productName = productName;
        this.price = price;
        this.productId = productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }



    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                '}';
    }
}
