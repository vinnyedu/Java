package org.modulo05;

import java.util.Scanner;

public class example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("Menor = " + a);
        } else if (b < c) {
            System.out.println("Menor = " + b);
        } else {
            System.out.println("Menor = " + c);
        }

        sc.close();
    }
}
