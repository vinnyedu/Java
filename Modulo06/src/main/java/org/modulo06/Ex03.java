package org.modulo06;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Alcool = 0, Gasolina = 0, Diesel = 0;
        System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim");
        int x = sc.nextInt();

        while (x != 4) {
            if (x == 1) {
                Alcool += 1;
            } else if (x == 2) {
                Gasolina += 1;
            }else if (x == 3) {
                Diesel += 1;
            }
            x = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool "+ Alcool);
        System.out.println("Gasolina "+ Gasolina);
        System.out.println("Diesel "+ Diesel);


        sc.close();
    }

}

