package org.modulo10.exercises;

import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Number %d: ", i);
            vector[i] = sc.nextDouble();
        }

        // Average
        double sum = 0;
        for (double v : vector) {
            sum += v;
        }
        double average = sum / vector.length;
        System.out.println("Average: " + average);

        // Below average
        System.out.println("Elements below average: ");
        for (double v : vector) {
            if (v < average) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
