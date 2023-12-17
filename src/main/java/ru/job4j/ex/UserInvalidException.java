package ru.job4j.ex;
/**
 * 0.5. Иерархия исключений и множественный catch. [#219368 #465203]
 * 2023-12-08
 * 2. Создайте класс ru.job4j.ex.UserInvalidException наследника от UserNotFoundException.
 */
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
