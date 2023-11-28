package org.example;

import org.example.services.BrazilInterestService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months");
        System.out.printf("%.2f%n", payment);

        sc.close();
    }
}