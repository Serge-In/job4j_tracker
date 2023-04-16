package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("George Inkerman");
        student.setGroup(123);
        int year = 2023, month = 4, dayOfMonth = 16;
        LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
        student.setEntryDate(localDate);
        System.out.println("student.fullName = " + student.getFullName());
        System.out.println("student.group = " + student.getGroup());
        System.out.println("student.entryDate = " + student.getEntryDate());
    }
}
