package org.modulo05;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] menu = {4, 4.5, 5, 2, 1.5};
        int a, b;
        double total;
        a = sc.nextInt();
        b = sc.nextInt();
        total = menu[a - 1] * b;

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
