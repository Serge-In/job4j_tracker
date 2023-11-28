package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

public class FindByID implements User {
    private final Output out;

    public FindByID(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Find item by id");
        int id = input.askInt("введите ID заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
        return true;
    }
}