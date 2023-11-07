package org.modulo11.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculations {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-11-07");
        LocalDateTime d05 = LocalDateTime.parse("2023-11-07T01:31:30");
        Instant d06 = Instant.parse("2023-11-07T01:31:30Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalData = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalData = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("--------------------");
        System.out.println("pastWeekLocalDataTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDataTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("--------------------");
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Duration

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("--------------------");
        System.out.println("t1 days = "+ t1.toDays());
        System.out.println("t2 days = "+ t2.toDays());
        System.out.println("t3 days = "+ t3.toDays());
        System.out.println("t4 days = "+ t4.toDays());
    }
}
