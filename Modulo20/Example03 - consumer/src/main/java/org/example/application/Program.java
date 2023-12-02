package org.example.application;

import org.example.entities.Product;
import org.example.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Table", 350.5));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Keyboard", 89.9));

        // Interface method
        // list.forEach(new PriceUpdate());

        // Method reference static
        // list.forEach(Product::staticPriceUpdate);

        // Method reference nonstatic
        // list.forEach(Product::nonStaticPriceUpdate);

        // Declared lambda expression
        /*double factor = 1.1;
        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * factor);
        list.forEach(consumer);*/

        // Inline lambda expression
        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}