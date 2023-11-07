package org.modulo08.applications;

import org.modulo08.entities.Student;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Student name:" );
        student.name = sc.nextLine();
        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.println("Final grade: " + student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("Missing %.2f%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
