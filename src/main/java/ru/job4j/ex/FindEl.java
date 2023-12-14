package ru.job4j.ex;

import javax.print.event.PrintServiceAttributeListener;

/**
 * 2023-11-29
 * 0.4. Пользовательские исключения. [#219367]
 * Создайте класс ru.job4j.ex.ElementNotFoundException. Класс должен наследоваться от java.lang.Exception.
 * Допишите метод поиска индекса элемента в строковом массиве.
 * Если элемента нет, то нужно выкинуть исключение ElementNotFoundException. В сигнатуре метода объявить это исключение.
 * Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch.
 * 2023-12-08
 * 0.4. Пользовательские исключения. [#219367 #463171]
 * Допишите метод поиска индекса элемента в строковом массиве. FindEl
 */

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element isn't found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (int i = 0; i < abuses.length; i++) {
            if (value.equals(abuses[i])) {
                throw new ElementAbuseException("Element is abused");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {

        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] value = {"1", "2", "3"};
        String[] abuses = {"1", "2", "6"};
        String key = "3";
        try {
            System.out.println("index in array for element: " + key + " is " + indexOf(value, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("element to sent: " + key + " is ");
        process(value, key, abuses);
    }
}