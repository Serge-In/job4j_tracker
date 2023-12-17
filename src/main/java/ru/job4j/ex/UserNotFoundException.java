package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch. [#219368 #465203]
 * 2023-12-08
 * 1. Создайте класс ru.job4j.ex.UserNotFoundException наследника от Exception.
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
