package org.example.application;

import org.example.entities.Account;
import org.example.entities.BusinessAccount;
import org.example.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING - subclass to superclass

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCAST - superclass to subclass

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);


        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE!");
        }
    }
}
