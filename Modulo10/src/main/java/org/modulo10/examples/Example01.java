package org.modulo10.examples;

import java.util.Arrays;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array length: ");
        int n = sc.nextInt();
        double sum = 0;

        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.println(Arrays.toString(vect));
        System.out.printf("Average Height: %.2f%n", sum/n);

        sc.close();
    }
}
