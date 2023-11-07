package org.modulo10.exercises;

import org.modulo10.entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employees employee = new Employees(id, name, salary);
            list.add(employee);

            System.out.println();
        }

        for (Employees e : list) {
            System.out.println(e);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employees employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println("List of employees: ");
        System.out.println();
        for (Employees e : list) {
            System.out.println(e);
        }
        sc.close();
    }
}
