package org.modulo10.exercises;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number: ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        int sum = 0;
        int count = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("number %d: ", (i + 1));
            sc.nextLine();
            int number = sc.nextInt();
            vector[i] = number;
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;

        if (count == 0) {
            System.out.println("No even number");
        } else {
            System.out.printf("Even number average %.1f%n", average);
        }

        sc.close();
    }
}
