package org.example.application;

import org.example.entities.Company;
import org.example.entities.Individual;
import org.example.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployee));
            }
        }

        double sum = 0;
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : list) {
            System.out.printf("%s: $%.2f%n", taxPayer.getName(), taxPayer.tax());
            sum += taxPayer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
