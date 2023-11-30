package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            int id = sc.nextInt();
            a.add(id);
        }

        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            int id = sc.nextInt();
            b.add(id);
        }

        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            int id = sc.nextInt();
            c.add(id);
        }

        Set<Integer> total = new HashSet<>();
        total.addAll(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
