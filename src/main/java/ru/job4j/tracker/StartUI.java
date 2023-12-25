package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.Output;

import java.util.Arrays;
import java.util.List;

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
 * 2023-12-08
 * в метод init добавьте обработку ситуаций: ввод несуществующего пункта меню, ввода строки вместо числа.
 * изменим ввод Input input = new Console() с Console на ValidateInput
 *
 */
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<User> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неверный ввод, вы можете выбрать: 0 .. " + (actions.size() - 1));
                continue;
            }
            User action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<User> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ru.job4j.tracker.output.Console();
        Input input = new ValidateInput(output, new ru.job4j.tracker.input.Console());
        Tracker tracker = new Tracker();

        List<User> actions = Arrays.asList(new Create(output),
                new Listing(output),
                new Listing(output),
                new Edit(output),
                new Delete(output),
                new FindByID(output),
                new FindItemsByName(output),
                new Exit(output)
        );

        new StartUI(output).init(input, tracker, actions);
    }
}