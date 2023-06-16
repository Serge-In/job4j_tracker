package ru.job4j.tracker;

/**
 * 2023-06-15
 * 6.1. Разрыв зависимости StartUI от Scanner. [#181778  [#181778 #422924]]
 * 6. В методе StartUI.main мы создаем объект new Scanner.
 * Вместо объекта new Scanner нужно прописать объект реализации интерфейса Input.
 * Input input = new ConsoleInput();
 * 7. Статические методы. [#181779  [#181779]]
 * Создайте статические методы createItem, editItem, deleteItem и т.д.
 * 8. Input и полиморфизм. [#181094  [#181094]]
 * Напишите тест на  метод StartUI.createItem.
 * 9. Тестирование. Подготовка данных. [#182960  [#182960]]
 * Напишите тест на метод StartUI.editItem.
 * Напишите тест на метод StartUI.deleteItem. В этом случае поиск в объекте tracker должен вернуть null.
 * 2023-06-16
 * 11.1. Реализация меню за счет шаблона стратегия. [#181780 # [#181780]]
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * Нам нужно заменить вывод в консоль на интерфейс Output.
 * Внедрение зависимости будем делать через конструктор CreateAction.
 */
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ListAction(output),
                new EditAction(output),
                new DeleteAction(output),
                new FindByIDAction(output),
                new FindItemsByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}