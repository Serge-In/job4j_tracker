package ru.job4j.ex;

/**
 * 2023-06-18
 * 0.1. java.lang.NullPointerException [#219364  [#219364]]
 * исправить ошибку NPE
 */
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}