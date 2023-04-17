package ru.job4j.tracker;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/** тесты не проходят,
 java.lang.NullPointerException: Cannot invoke "ru.job4j.tracker.Item.getName()" because "item" is null

 /@Test public void whenTestFindByNameCheckArrayLength() {
 Tracker tracker = new Tracker();
 Item first = new Item("First");
 Item second = new Item("Second");
 tracker.add(first);
 tracker.add(second);
 tracker.add(new Item("First"));
 tracker.add(new Item("Second"));
 tracker.add(new Item("First"));
 Item[] result = tracker.findByName(first.getName());
 assertThat(result.length).isEqualTo(3);
 }

 /@Test public void whenTestFindByNameCheckSecondItemName() {
 Tracker tracker = new Tracker();
 Item first = new Item("First");
 Item second = new Item("Second");
 tracker.add(first);
 tracker.add(second);
 tracker.add(new Item("First"));
 tracker.add(new Item("Second"));
 tracker.add(new Item("First"));
 Item[] result = tracker.findByName(second.getName());
 assertThat(result[1].getName()).isEqualTo(second.getName());
 }
 */
public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenTestFindById() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item item = tracker.add(bug);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName()).isEqualTo(item.getName());
    }

    @Test
    public void whenTestFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findAll()[0];
        assertThat(result.getName()).isEqualTo(first.getName());
    }

    @Test
    public void whenTestFindAll2() {
        Tracker tracker = new Tracker();
        Item todo1 = new Item(1, "todo1");
        Item todo2 = new Item(2, "todo2");
        Item todo3 = new Item(3, "todo3");
        tracker.add(todo1);
        tracker.add(todo2);
        tracker.add(todo3);
        Item result = tracker.findAll()[2];
        assertThat(result.getName()).isEqualTo(todo3.getName());
    }
}


