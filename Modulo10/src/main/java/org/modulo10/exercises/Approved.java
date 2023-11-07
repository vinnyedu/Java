package org.modulo10.exercises;

import java.util.Scanner;

public class Approved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] gradeOne = new double[n];
        double[] gradeTwo = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Student #" + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("First Grade: ");
            gradeOne[i] = sc.nextDouble();
            System.out.print("Second Grade: ");
            gradeTwo[i] = sc.nextDouble();
        }

        double media;


        System.out.println("\nApproved students: ");
        for (int i = 0; i < n; i++) {
            media = (gradeOne[i] + gradeTwo[i]) / 2;
            if (media >= 6) {
                System.out.println(names[i]);
            }
        }

        sc.close();
    }
}
