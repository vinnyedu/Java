package org.modulo10.exercises;

import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number: ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("number %d: ", (i+1));
            sc.nextLine();
            int number = sc.nextInt();
            vector[i] = number;
        }

        System.out.println("Negative number: ");
        for (int v : vector) {
            if (v < 0) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
