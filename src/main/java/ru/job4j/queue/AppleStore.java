package ru.job4j.queue;

import java.util.Queue;

/**
 * 2023-12-25
 * 1. Интерфейс Queue [#504942]
 * поле Queue хранит в себе очередь клиентов, которые пришли в магазин;  очередь не может быть пустой;
 * поле count хранит в себе количество доступного к покупке товара;
 * метод getLastHappyCustomer() должен вернуть имя последнего счастливого обладателя желаемого товара;
 * метод getFirstUpsetCustomer() должен вернуть имя первого клиента, которому сегодня не повезло и ему не хватило товара;
 * - для решения вам пригодится метод poll(), а также в обоих методах цикл fori;
 * - всегда существует последний счастливый обладатель товара и клиент, которому не повезло и товара не хватило.
 *  Т.е. при последовательном удалении объектов из очереди не может сложиться ситуации,
 *  что при удалении текущего объекта Customer из очереди он не может быть null, проверять это не нужно.
 */
public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int i = 0; i < count - 1; i++) {
            queue.poll();
        }
        return queue.poll().name();

    }

    public String getFirstUpsetCustomer() {
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
        return queue.poll().name();
    }
}
