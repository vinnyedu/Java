package org.modulo04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Numero do funcionario:");
        number = sc.nextInt();
        double hour, price;
        System.out.println("Horas trabalhadas:");
        hour = sc.nextDouble();
        System.out.println("Valor da hora trabalhada:");
        price = sc.nextDouble();
        double salary = hour * price;

        System.out.println("Numero: " + number);
        System.out.printf("Salary: U$ %.2f%n", salary);

        sc.close();
    }
}
