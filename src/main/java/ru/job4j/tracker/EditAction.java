package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Edit item");
        int id = input.askInt("введите ID заменяемой заявки: ");
        String name = input.askStr("введите имя новой заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка id = " + id + " заменена");
        } else {
            System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
        return true;
    }
}