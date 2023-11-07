package org.modulo08.applications;

import org.modulo08.entities.CurrencyConverter;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double bought = sc.nextDouble();

        double paid = CurrencyConverter.dolar(price, bought);
        System.out.println("Amount to be paid in reais = " + paid);

        sc.close();
    }
}
