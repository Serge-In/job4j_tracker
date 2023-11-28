package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

public class Delete implements User {
    private final Output out;

    public Delete(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Delete item");
        int id = input.askInt("введите ID удаляемой заявки: ");
        if (tracker.delete(id)) {
            out.println("Заявка id = " + id + " удалена");
        } else {
            out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
        return true;
    }
}
