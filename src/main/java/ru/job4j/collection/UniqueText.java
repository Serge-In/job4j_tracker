package ru.job4j.collection;

import java.util.HashSet;

/**
 * 2023-12-23
 * 2. Идентичные тексты [#212655]
 *  Нам нужно написать метод, который будет сравнивать два текста.
 * Если они состоят из один и тех же слов, то мы считаем, что текст не уникальный.
 * "Мы делаем дома и коттеджи" и "Мы делаем коттеджи и дома". Оба текста состоят из одинаковых слов.
 *  В коллекции java.util.HashSet есть метод contains. Он принимает элемент коллекции
 *  и возвращает true, если элемент уже есть или false, если его нет.
 *  То есть, этот метод есть в любой коллекции.
 *  Но в HashSet он работает за константное время.
 */
public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();

        for (String word : origin) {
            check.add(word);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                result = false;
                break;
            }
        }
        return result;
    }
}