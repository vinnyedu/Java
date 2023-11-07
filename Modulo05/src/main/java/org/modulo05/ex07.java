package org.modulo05;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, ir;
        salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            ir = (salario - 2000) * 8 / 100;
            System.out.printf("R$ %.2f%n", ir);
        } else if (salario <= 4500) {
            ir = (1000.0 * 8 / 100) + (salario - 3000) * 18 / 100;
            System.out.printf("R$ %.2f%n", ir);
        } else {
            ir = 1000.0 * 8 / 100 + 1500.0 * 18 / 100 + (salario - 4500) * 28 / 100;
            System.out.printf("R$ %.2f%n", ir);
        }


        sc.close();
    }
}
