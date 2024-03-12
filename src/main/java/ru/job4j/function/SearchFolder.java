package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 2024-03-11
 * 2.3. Встроенные функциональные интерфейсы. [#249209]
 * Ваша задача - реализовать универсальный метод filter(), для проверки в if() в нем вы будете использовать функциональный интерфейс Predicate.
 * После реализации - методы filterSize() и filterName() нужно будет удалить.
 */
public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }
}
