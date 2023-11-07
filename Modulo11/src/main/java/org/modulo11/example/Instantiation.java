package org.modulo11.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instantiation {
    public static void main(String[] args) {


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        // ISO 8601

        LocalDate d04 = LocalDate.parse("2023-11-07");
        LocalDateTime d05 = LocalDateTime.parse("2023-11-07T01:31:30");
        Instant d06 = Instant.parse("2023-11-07T01:31:30Z");
        Instant d07 = Instant.parse("2023-11-07T01:31:30-03:00");

        // Custom Date Format

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("07/11/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("07/11/2023 15:31", fmt2);

        // Isolated Data

        LocalDate d10 = LocalDate.of(2023, 11, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 11, 20, 15, 31);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}