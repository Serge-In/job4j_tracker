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

        //dateTimeFormatter = ReducedValue(YearOfEra,2,2,2000-01-01)'-'Value(MinuteOfHour,2)'-'Value(DayOfMonth,2)' '' 'Value(ClockHourOfAmPm)'-'Value(MinuteOfHour,2)'-'Value(SecondOfMinute,2)
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-mm-dd  h-mm-ss");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //dateTimeFormatter = 14-04-2023 09:32:56
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("dateTimeFormatter = " + currentDateTimeFormat);

        formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss"); //dateTimeFormatter = 14-апр.-2023 09:34:31
        currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("dateTimeFormatter = " + currentDateTimeFormat);

        formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm:ss"); //dateTimeFormatter = 14-апреля-2023 09:35:16
        currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("dateTimeFormatter = " + currentDateTimeFormat);
    }
}
