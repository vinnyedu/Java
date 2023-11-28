package org.example.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater then zero");
        }
        return amount * Math.pow(1 + getInterestRate() / 100, months);
    }

}
