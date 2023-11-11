package org.example.application;

import org.example.entities.Circle;
import org.example.entities.Rectangle;
import org.example.entities.Shape;
import org.example.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

        // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

        List<Shape> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char type = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());
            if (type == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
