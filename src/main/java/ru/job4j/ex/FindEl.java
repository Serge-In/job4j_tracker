package ru.job4j.ex;

/**
 * 2023-11-29
 * 0.4. Пользовательские исключения. [#219367]
 * Создайте класс ru.job4j.ex.ElementNotFoundException. Класс должен наследоваться от java.lang.Exception.
 * Допишите метод поиска индекса элемента в строковом массиве.
 * Если элемента нет, то нужно выкинуть исключение ElementNotFoundException. В сигнатуре метода объявить это исключение.
 * Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch.
 */

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element isn't found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"1", "2", "3"};
        String key = "5";
        try {
            System.out.println("index in array for element: " + key + " is " + indexOf(value, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}