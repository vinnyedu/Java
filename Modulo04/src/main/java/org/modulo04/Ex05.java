package org.modulo04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, n1, n2;
        double valor1, valor2, total;
        System.out.println("Codigo peca 1:");
        cod1 = sc.nextInt();
        System.out.println("Numero de pecas 1:");
        n1 = sc.nextInt();
        System.out.println("Valor peca 1:");
        valor1 = sc.nextDouble();

        System.out.println("Codigo peca 2:");
        cod2 = sc.nextInt();
        System.out.println("Numero de pecas 2:");
        n2 = sc.nextInt();
        System.out.println("Valor peca 2:");
        valor2 = sc.nextDouble();

        total = n1 * valor1 + n2 * valor2;
        System.out.println("Total a pagar: R$ " + total);
        sc.close();
    }
}
