package ru.job4j.tracker;

/**
 * 2023-06-16
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * Нам нужно заменить вывод в консоль на интерфейс Output.
 * Внедрение зависимости будем делать через конструктор.
 */
public class ListAction implements UserAction {
    private final Output out;

    public ListAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "List of Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("хранилище еще не содержит заявок");
        } else {
            System.out.println("Список заявок:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
        return true;
    }
}
