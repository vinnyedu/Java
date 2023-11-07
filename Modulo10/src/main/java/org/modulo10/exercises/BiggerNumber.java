package org.modulo10.exercises;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number: ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("number %d: ", (i + 1));
            sc.nextLine();
            double number = sc.nextDouble();
            vector[i] = number;
        }

        // Bigger Number
        double bigger = vector[0];
        int position = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > bigger) {
                bigger = vector[i];
                position = i;
            }
        }

        System.out.println("\nBigger number: " + bigger);
        System.out.println("\nPosition of the largest number: " + position);

        sc.close();
    }
}
