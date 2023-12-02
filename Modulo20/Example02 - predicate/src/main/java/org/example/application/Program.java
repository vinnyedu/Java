package org.example.application;

import org.example.entities.Product;
import org.example.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Table", 350.5));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Keyboard", 89.9));

        // Interface implementation
        // list.removeIf(new ProductPredicate());

        // Reference static method
        // list.removeIf(Product::staticProductPredicate);

        // Reference nonstatic method
        // list.removeIf(Product::nonStaticProductPredicate);

        // Declared lambda expression
        // Predicate<Product> predicate = product -> product.getPrice() >= 100;
        // list.removeIf(predicate);

        // Inline lambda expression
        list.removeIf(product -> product.getPrice() >= 100);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}