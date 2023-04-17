package ru.job4j.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeExamples {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2017, 0, 25);
        Date date = calendar.getTime();
        System.out.println(date);

        String strDate = "Sat, April 4, 2020";
        //SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}
