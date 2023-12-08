package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.Stub;
import ru.job4j.tracker.output.Output;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 2023-06-16
 * 12.0. Написать тесты на StartUI. [#785  [#785]]
 * 2023-06-18
 * 12.2. Тесты вывода на консоль [#33585  [#33585]]
 * Произвести тестирование классов ListAction, FindByNameAction, FindByIdAction.
 * 2023-12-08
 * whenInvalidExit тесты на сценарий, где пользователь вводит сначала несуществующий пункт, а потом верный.
 */
public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new ru.job4j.tracker.output.Stub();
        Input in = new Stub(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        User[] actions = {
                new Create(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        Output out = new ru.job4j.tracker.output.Stub();
        String replacedName = "New item name";
        Input in = new Stub(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        User[] actions = {
                new Edit(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Output out = new ru.job4j.tracker.output.Stub();
        Input in = new Stub(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        User[] actions = {
                new Delete(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    public void whenExit() {
        Output out = new ru.job4j.tracker.output.Stub();
        Input in = new Stub(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        User[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu." + ln
                + "0. Exit" + ln
                + "Exit" + ln
        );
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new ru.job4j.tracker.output.Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new Stub(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        User[] actions = new User[]{
                new Edit(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu." + ln
                + "0. Edit item" + ln
                + "1. Exit" + ln
                + "Edit item" + ln
                + "Заявка id = " + one.getId() + " заменена" + ln
                + "Menu." + ln
                + "0. Edit item" + ln
                + "1. Exit" + ln
                + "Exit" + ln
        );
    }

    @Test
    public void whenListActionTestOutputIsSuccessfully() {
        Output out = new ru.job4j.tracker.output.Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new Stub(
                new String[]{"0", "1"}
        );
        User[] actions = new User[]{
                new List(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu." + ln
                + "0. List of Items" + ln
                + "1. Exit" + ln
                + "Список заявок:" + ln + one + ln
                + "Menu." + ln
                + "0. List of Items" + ln
                + "1. Exit" + ln
                + "Exit" + ln
        );
    }

    @Test
    public void whenFindByIdActionTestOutputIsSuccessfully() {
        Output out = new ru.job4j.tracker.output.Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new Stub(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        User[] actions = new User[]{
                new FindByID(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu." + ln
                + "0. Find item by id" + ln
                + "1. Exit" + ln
                + "Find item by id" + ln + one + ln
                + "Menu." + ln
                + "0. Find item by id" + ln
                + "1. Exit" + ln
                + "Exit" + ln
        );
    }

    @Test
    public void whenFindItemsByNameActionTestOutputIsSuccessfully() {
        Output out = new ru.job4j.tracker.output.Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new Stub(
                new String[]{"0", one.getName(), "1"}
        );
        User[] actions = new User[]{
                new FindItemsByName(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu." + ln
                + "0. Find items by name" + ln
                + "1. Exit" + ln
                + "Find items by name" + ln + one + ln
                + "Menu." + ln
                + "0. Find items by name" + ln
                + "1. Exit" + ln
                + "Exit" + ln
        );
    }

    @Test
    void whenInvalidExit() {
        Output output = new ru.job4j.tracker.output.Stub();
        Input in = new Stub(
                new String[] {"4", "0"}
        );
        Tracker tracker = new Tracker();
        User[] actions = {
                new Exit(output)
        };

        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Неверный ввод, вы можете выбрать: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                        + "Exit" + ln
        );
    }
}
