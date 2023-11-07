package org.modulo05;

import java.util.Arrays;
import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x1, x2, delta;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = %.5f%n", x1);
            System.out.printf("x2 = %.5f%n", x2);
        }


        sc.close();
    }
}
