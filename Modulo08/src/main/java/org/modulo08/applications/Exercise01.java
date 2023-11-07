package org.modulo08.applications;

import org.modulo08.entities.Rectangle;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Rectangle width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Rectangle height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
