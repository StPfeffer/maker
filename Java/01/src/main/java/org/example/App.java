package org.example;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Teclado", 85.00, 15,
                   "http://example.com/produto1.jpg");

        product1.printProduct();

        SaveProduct test = new SaveProduct(product1); // salva em um arquivo json, podendo ser sobreescrito
    }
}