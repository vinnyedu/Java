package org.modulo10.exercises;

import java.util.Scanner;

public class PeopleData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");
        int n = sc.nextInt();

        double[] height = new double[n];
        char[] sex = new char[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Person #" + (i + 1) + " height: ");
            height[i] = sc.nextDouble();
            System.out.print("Person #" + (i + 1) + " sex: ");
            sex[i] = sc.next().charAt(0);
        }

        double smaller, bigger, averageFemale, femaleHeight;
        int male, count;

        smaller = height[0];
        bigger = height[0];
        male = 0;
        count = 0;
        femaleHeight = 0;


        for (int i = 0; i < n; i++) {
            if (height[i] > bigger) {
                bigger = height[i];
            }
            if (height[i] < smaller) {
                smaller = height[i];
            }
            if (sex[i] == 'm') {
                male++;
            } else {
                femaleHeight += height[i];
                count++;
            }
        }

        averageFemale = femaleHeight / count;

        System.out.println("Smaller height: " + smaller);
        System.out.println("Bigger height: " + bigger);
        System.out.printf("Female average height: %.2f%n", averageFemale);
        System.out.println("Males: " + male);

        sc.close();
    }
}
