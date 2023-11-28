package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

/**
 * 2023-06-16
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * Нам нужно заменить вывод в консоль на интерфейс Output.
 * Внедрение зависимости будем делать через конструктор.
 */
public class List implements User {
    private final Output out;

    public List(Output out) {
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
            out.println("хранилище еще не содержит заявок");
        } else {
            out.println("Список заявок:");
            for (Item item : items) {
                out.println(item);
            }
        }
        return true;
    }
}
