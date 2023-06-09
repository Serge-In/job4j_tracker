package ru.job4j.ex;

/**
 * 2023-06-18
 * 0.2. Кидаем исключение - throw new RuntimeException [#219365  [#219365]]
 * Добавьте проверку входного параметра в метод calc. Если n < 0, то нужно прервать
 * программу с исключением IllegalArgumentException("N could not be less than 0").
 * 0.3. Тестирование исключений с junit [#219366  [#219366]]
 * Напишите тесты проверки прерывания на класс подсчета факториала.
 */
public class Fact {
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less than 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(new Fact().calc(-1));
    }
}