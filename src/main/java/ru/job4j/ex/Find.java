package ru.job4j.ex;
/**
 * 2023-12-17
 * 3. Замена if-else-throw на if-throw [#49895]
 * необходимо избавиться от блока if-else-throw. Сделать это необходимо так, чтобы после изменений все тесты выполнялись корректно.
 */

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }
}