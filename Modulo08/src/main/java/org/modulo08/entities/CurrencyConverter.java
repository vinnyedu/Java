package org.modulo08.entities;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double dolar(double value, double amount) {
        return value * amount * IOF;
    }
}
