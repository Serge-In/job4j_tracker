package ru.job4j.tracker;

/**
 * 2023-06-16
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * В этом уроке мы воспользуемся подходом разрыва зависимостей
 * чтобы не тестировать вывод через System.out.println, разорвем зависимость
 * через имплементацию интерфейса Output.
 * 1й - класс StubOutput
 * 2й - класс ConsoleOutput
 * эти классы можно тестировать
 */
public interface Output {
    void println(Object obj);
}
