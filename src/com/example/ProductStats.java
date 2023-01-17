package com.example;

public class ProductStats {

    public static double calculateTotalPrice(Product[] cesta) {

        double totalPrice = 0.0;

        for (Product product : cesta) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public static double calculateMediaPrices(Product[] cesta) {
        return calculateTotalPrice(cesta) / cesta.length;
    }

    public static double calculaMaxPrice(Product[] cesta) {

        double maxPrice = 0.0;

        for (Product product : cesta) {
            if (product.getPrice() > maxPrice)
                maxPrice = product.getPrice();

        }
        return maxPrice;
    }

}
