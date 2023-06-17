package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Edit item");
        int id = input.askInt("введите ID заменяемой заявки: ");
        String name = input.askStr("введите имя новой заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Заявка id = " + id + " заменена");
        } else {
            out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
        return true;
    }
}