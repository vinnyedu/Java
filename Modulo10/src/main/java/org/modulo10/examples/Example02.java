package org.modulo10.examples;

import org.modulo10.entities.Product;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array length: ");
        int n = sc.nextInt();

        Product[] vector = new Product[n];

        for (int i = 1; i <= vector.length; i++) {
            System.out.println("Rent #" + i);
            sc.nextLine();
            System.out.print("Product name: ");
            String name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
        }

        double sum = 0;

        /*
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }
        */

        for (Product product : vector) {
            sum += product.getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price: $ %.2f%n", avg);

        sc.close();
    }
}
