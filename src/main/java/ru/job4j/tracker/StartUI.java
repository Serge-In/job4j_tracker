package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    static void main(String[] args) {
        Item item = new Item();
        LocalDateTime itemCreatedDT = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemCreatedDTFormatted = itemCreatedDT.format(formatter);
        System.out.println("itemCreatedDTFormatted = " + itemCreatedDTFormatted);
    }
}