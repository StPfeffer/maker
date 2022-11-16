package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String imageUrl;

    public Product(String name, double price, int quantity, String imageUrl) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    void printProduct() {
        System.out.println("Produto: " + this.name + "\nPreço: " + this.price +
                "\nQuantidade: " + this.quantity);
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

    String getImage() {
        return this.imageUrl;
    }
}