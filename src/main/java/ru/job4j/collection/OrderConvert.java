package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * 2023-12-26
 * 2. Преобразования List в Map. [#10093]
 * Внутри метода process нужно пройти по всем элементам списка orders и вставить их в map.
 * Чтобы пройти по элементам orders используйте цикл for-earch.
 * Чтобы вставить данные в map используйте метод map.put. Первый параметр будет номер, а второй заявка.
 */

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
