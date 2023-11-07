package org.modulo10.exercises;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] height = new double[n];

        int minor = 0;
        double sumHeight = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Name %d: ", i + 1);
            names[i] = sc.nextLine();
            System.out.printf("Age %d: ", i + 1);
            ages[i] = sc.nextInt();
            if (ages[i] < 16) {
                minor += 1;
            }
            System.out.printf("Height %d: ", i + 1);
            height[i] = sc.nextDouble();
            sumHeight += height[i];
        }

        System.out.printf("Average Height: %.2f%n", sumHeight/ height.length);

        double averageAge = (double) minor / ages.length * 100;
        System.out.printf("People under 16: %.1f%%%n", averageAge) ;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }


        sc.close();
    }
}
