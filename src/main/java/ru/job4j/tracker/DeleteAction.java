package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
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
