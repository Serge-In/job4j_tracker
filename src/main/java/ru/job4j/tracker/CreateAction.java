package ru.job4j.tracker;

/**
 * 2023-06-16
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * Нам нужно заменить вывод в консоль на интерфейс Output.
 * Внедрение зависимости будем делать через конструктор CreateAction.
 */
public class CreateAction implements UserAction {

    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
        return true;
    }
}