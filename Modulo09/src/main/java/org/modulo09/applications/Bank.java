package org.modulo09.applications;

import org.modulo09.entities.Accounts;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accounts accounts;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            accounts = new Accounts(number, name, initialDeposit);

        } else {
            accounts = new Accounts(number, name);

        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(accounts);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double movement = sc.nextDouble();
        accounts.deposit(movement);
        System.out.print("Update Account: ");
        System.out.println(accounts);

        System.out.println();
        System.out.print("Enter a withdrew value: ");
        movement = sc.nextDouble();
        if (movement > 0) {
            accounts.withdraw(movement);
        }
        System.out.print("Update Account: ");
        System.out.println(accounts);

        sc.close();
    }
}
