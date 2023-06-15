package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select =  input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                if (items.length == 0) {
                    System.out.println("хранилище еще не содержит заявок");
                } else {
                    System.out.println("Список заявок:");
                    for (Item item : items) {
                        System.out.println(item);
                    }
                }
            } else if (select == 2) {
                System.out.println("Edit item");
                int id =  input.askInt("введите ID заменяемой заявки: ");
                String name = input.askStr("введите имя новой заявки: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка id = " + id + " заменена");
                } else {
                    System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
                }
            } else if (select == 3) {
                System.out.println("Delete item");
                int id =  input.askInt("введите ID удаляемой заявки: ");
                if (tracker.delete(id)) {
                    System.out.println("Заявка id = " + id + " удалена");
                } else {
                    System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
                }
            } else if (select == 4) {
                System.out.println("Find item by id");
                int id =  input.askInt("введите ID заявки: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
                }
            } else if (select == 5) {
                System.out.println("Find items by name");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем = " + name + " отсутствует в списке заявок");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
      Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}