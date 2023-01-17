package com.example;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String productName;
    private double price;
    private int productId;

    public Product(){

    }
    public Product(String productName, double price, int productId){
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


    public static double calculateTotalPrice(Product[] cesta){

        double totalPrice = 0.0;

        for (Product product : cesta) {
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
    }

    public static double  calculateMediaPrices(Product[] cesta){

        return calculateTotalPrice(cesta) / cesta.length;
    }

    public static double calculaMaxPrice (Product[]cesta){

        double maxPrice = 0.0;

        for (int i = 0; i<cesta.length; i++) {

            if( cesta[i].getPrice() > maxPrice) {
                maxPrice = cesta[i].getPrice();
            }
        }
        return maxPrice;
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
