package ru.job4j.tracker;

/**
 * 2023-06-15
 * 6.1. Разрыв зависимости StartUI от Scanner. [#181778  [#181778 #422924]]
 * 6. В методе StartUI.main мы создаем объект new Scanner.
 * Вместо объекта new Scanner нужно прописать объект реализации интерфейса Input.
 * Input input = new ConsoleInput();
 * 7. Статические методы. [#181779  [#181779]]
 * Создайте статические методы createItem, editItem, deleteItem и т.д.
 */
public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void listItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("хранилище еще не содержит заявок");
        } else {
            System.out.println("Список заявок:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("Edit item");
        int id = input.askInt("введите ID заменяемой заявки: ");
        String name = input.askStr("введите имя новой заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка id = " + id + " заменена");
        } else {
            System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("Delete item");
        int id = input.askInt("введите ID удаляемой заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка id = " + id + " удалена");
        } else {
            System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("Find item by id");
        int id = input.askInt("введите ID заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка id = " + id + " отсутствует в списке заявок");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
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
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.listItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
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