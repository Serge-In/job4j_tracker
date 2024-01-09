package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2024-01-09
 * 3. Отсортировать департаменты [#34352]
 * Для сортировки по убыванию реализуйте отдельный компаратор DepartmentsDescComparator
 * Класс DepDescComp должен расширять интерфейс Comparator:
 * метод compare() должен реализовать сравнение в соответствии с описанием.
 */
public class DepartmentsDescComparator implements Comparator<String> {
    /**
     * Реализация сравнения двух строк по убыванию первого элемента строки и по-возрастанию остальных элементов.
     * элементы строки разделены символом "/"
     * 1 из каждой строки отделить первые элементы до символа "/" и остаток строк после "/"
     * 2 получить результат сравнения по убыванию первых элементов,
     * если результат = 0, получить результат сравнения по возрастанию остатков строк без первых элементов
     * вернуть итоговый результат
     * @param left the first object to be compared.
     * @param right the second object to be compared.
     * @return
     */
    @Override
    public int compare(String left, String right) {
        char separator = '/';
        int res;
        String firstElemLeft = left.indexOf(separator) > 0 ? left.substring(0, left.indexOf(separator)) : left;
        String firstElemRight = right.indexOf(separator) > 0 ? right.substring(0, right.indexOf(separator)) : right;
        res = firstElemRight.compareTo(firstElemLeft);
        if (res == 0) {
            String restElemLeft = left.substring(left.indexOf(separator) + 1);
            String restElemRight = right.substring(right.indexOf(separator) + 1);
            res = restElemLeft.compareTo(restElemRight);
        }
        return res;
    }
}
