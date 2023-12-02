package org.example.application;

import org.example.entities.Product;
import org.example.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Table", 350.5));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Keyboard", 89.9));

        //List<String> names = list.stream().map(new UpperCaseName()).toList();

        // Method reference static
        //List<String> names = list.stream().map(Product::staticUpperCaseName).toList();

        // Method reference nonstatic
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();

        // Declared lambda expression
        // Function<Product, String> function = product -> product.getName().toUpperCase();
        // List<String> names = list.stream().map(function).toList();

        // Inline lambda expression
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}