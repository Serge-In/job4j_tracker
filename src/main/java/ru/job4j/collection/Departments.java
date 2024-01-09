package ru.job4j.collection;

import java.util.*;

/**
 * 2024-01-09
 * 3. Отсортировать департаменты [#34352]
 *
 */
public class Departments {

    /**
     * метод fillGaps() должен сформировать список строк,
     * при этом требуется учесть все возможно отсутствующие коды подразделений;
     * Для этого каждую входящую строку нужно разбить на одиночные элементы.
     * Для этого можно использовать метод String.split("/").
     * Этот метод вернет массив одиночных элементов.
     * Далее нужно через цикл последовательно складывать элементы и добавлять их в множество.
     * Используйте в качестве промежуточного хранения LinkedHashSet.
     * Промежуточная коллекция LinkedHashSet позволяет устранить дубликаты из коллекции,
     * которые будут получаться в результате последовательного складывания единичных департаментов.
     * При этом данные в LinkedHashSet будут отсортированы в том порядке, в котором они добавляются в LinkedHashSet.
     * @param departments
     * @return
     */
    public static List<String> fillGaps(List<String> departments) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : departments) {
            String start = "";
            for (String element : value.split("/")) {
                temp.add(start + "/" + element);
                start = start + "/" + element;
            }
        }

        ArrayList<String> res = new ArrayList<>();
        for (String el : temp) {
            res.add(el.substring(1));
        }
        return res;
    }

    /**
     * метод sortAsc() должен просто отсортировать по возрастанию список строк, который он принимает на вход,
     * вызывать дополнительно fillGaps() в этом методе не нужно;
     * Это классическая сортировка по возрастанию - Comparator.naturalOrder().
     * @param departments
     */
    public static void sortAsc(List<String> departments) {
        departments.sort(Comparator.naturalOrder());
    }

    /**
     * метод sortDesc() должен просто отсортировать в соответствии с компаратором DepDescComp список строк,
     * который он принимает на вход, вызывать дополнительно fillGaps() в этом методе не нужно;
     * нужно сравнить первые элементы по убыванию, если они равны,
     * то сравнить последующие элементы, но в возрастающем порядке.
     * Для сортировки по убыванию реализуйте отдельный компаратор DepartmentsDescComparator
     * @param departments
     */
    public static void sortDesc(List<String> departments) {
        departments.sort(new DepartmentsDescComparator());
    }
}