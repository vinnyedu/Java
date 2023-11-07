package org.modulo10.exercises;

import java.util.Scanner;

public class Older {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }

        int older = ages[1];
        String olderName= names[1];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > older) {
                older = ages[i];
                olderName = names[i];
            }
        }

        System.out.println();
        System.out.println("Older person: " + olderName);

        sc.close();
    }
}
