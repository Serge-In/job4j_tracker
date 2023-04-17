package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("dateTimeFormatter = " + currentDateTimeFormat);

        formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
        currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("dateTimeFormatter = " + currentDateTimeFormat);

        formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm:ss");
        currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("dateTimeFormatter = " + currentDateTimeFormat);
    }
}
