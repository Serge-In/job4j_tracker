package ru.job4j.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
     * Элементы строки разделены символом "/"
     * 1. делаем split() по / , сравниваем по убыванию первые элементы полученных массивов.
     * 2. Если получился 0 - сравниваем строки целиком по возрастанию
     * @param left the first object to be compared.
     * @param right the second object to be compared.
     * @return
     */
    @Override
    public int compare(String left, String right) {
        List<String> listLeft = new ArrayList<>(Arrays.asList(left.split("/")));
        List<String> listRight = new ArrayList<>(Arrays.asList(right.split("/")));
        int res = listRight.get(0).compareTo(listLeft.get(0));
        return (res == 0) ? left.compareTo(right) : res;
    }
}
