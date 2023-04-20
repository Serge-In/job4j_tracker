package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

/**
 * 2023-04-21
 * 2.0. Чтение из консоли. Класс Scanner. [#179514]
 * В этом задании нужно реализовать предсказателя.
 * Пользователь вводит вопрос, программа генерирует случайное число и выводит ответ на вопрос пользователя: да, нет, может быть.
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? \n");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        String out = switch (answer) {
            case 0 -> "Да";
            case 1 -> "Нет";
            default -> "Может быть";
        };
        System.out.println(out);
    }
}
