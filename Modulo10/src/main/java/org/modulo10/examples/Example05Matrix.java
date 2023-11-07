package org.modulo10.examples;

import java.util.Scanner;

public class Example05Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Matrix
        System.out.print("Matrix size: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Show main diagonal
        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        // Count negative number
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 0) {
                    count ++;
                }
            }
        }

        System.out.println("Negative number " + count);

        sc.close();
    }
}
