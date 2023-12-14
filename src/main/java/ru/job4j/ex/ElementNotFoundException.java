package ru.job4j.ex;
/**
 * 2023-12-08
 * 0.4. Пользовательские исключения. [#219367 #463171]
 *  Создайте класс ru.job4j.ex.ElementNotFoundException. Класс должен наследоваться от java.lang.Exception.
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
