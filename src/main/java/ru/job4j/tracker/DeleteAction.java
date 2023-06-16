package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Delete item");
        int id = input.askInt("введите ID удаляемой заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка id = " + id + " удалена");
        } else {
            System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
        return true;
    }
}
