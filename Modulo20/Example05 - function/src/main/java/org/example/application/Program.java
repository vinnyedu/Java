package org.example.application;

import org.example.entities.Product;
import org.example.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Table", 350.5));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Keyboard", 89.9));

        ProductService ps = new ProductService();

        // double sum = ps.filteredSum(list, product -> product.getName().charAt(0) == 'M');
        double sum = ps.filteredSum(list, product -> product.getPrice() < 100);

        System.out.println("Sum = " + String.format("%.2f", sum));

//        list.forEach(System.out::println);
    }
}