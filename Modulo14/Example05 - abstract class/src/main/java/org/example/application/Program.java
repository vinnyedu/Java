package org.example.application;

import org.example.entities.Account;
import org.example.entities.BusinessAccount;
import org.example.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

        // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

        List<Account> list = new ArrayList<>();

        list.add(new SavingAccount(1001, "Jose", 2000.0, 0.02));
        list.add(new SavingAccount(1002, "Anna", 1000.0, 0.01));
        list.add(new BusinessAccount(1003, "Max", 1000.0, 500.0));
        list.add(new SavingAccount(1004, "Alex", 1500.0, 0.015));
        list.add(new BusinessAccount(1005, "Carol", 5000.0, 1500.0));

        double sum = 0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        System.out.println();
        System.out.println("Update balance: ");
        for (Account acc : list) {
            acc.deposit(10);
            System.out.printf("Account %d: $%.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
