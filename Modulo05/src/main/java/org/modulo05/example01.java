package org.modulo05;

import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, total;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        total = n1 + n2;

        System.out.printf("Nota final: %.2f%n", total);
        if (total < 60) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
