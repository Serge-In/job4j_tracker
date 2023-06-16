package ru.job4j.tracker;

public class ListAction implements UserAction {
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
