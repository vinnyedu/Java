package org.modulo10.exercises;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number: ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Number %d: ", i + 1);
            vector[i] = sc.nextInt();
        }

        // Even numbers quantity
        System.out.println("Even numbers: ");
        int sum = 0;
        for (int v : vector) {
            if (v % 2 == 0) {
                System.out.printf("%d ", v);
                sum += 1;
            }
        }

        System.out.println("\n\nEven numbers quantity: " + sum);

        sc.close();
    }
}
