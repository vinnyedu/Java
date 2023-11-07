package org.modulo10.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number: ");
        int n = sc.nextInt();

        double[] vector = new double[n];
        double sum = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Number %d: ", i);
            vector[i] = sc.nextDouble();
            sum += vector[i];
        }

        // Values
        System.out.println("Values: " + Arrays.toString(vector));

        // Sum
        System.out.println("Sum: "+ sum);

        // Average
        double average = sum / n;
        System.out.println("Average: " + average);

        sc.close();
    }
}
