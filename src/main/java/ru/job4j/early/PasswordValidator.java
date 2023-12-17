package ru.job4j.early;

/**
 * 2023-12-17
 * 4. Принципы раннего возврата и охранных выражений [#504875]
 * 1. Создать класс PasswordValidator, который занимается проверкой пароля:
 * 2. Добавить валидацию в метод validate(), применив принцип охранных выражений.
 * Если password null, то выбросить исключение IllegalArgumentException с сообщением "Password can't be null";
 *
 * 3. Учесть требования к паролю ниже. Если хотя бы одно из требований нарушается,
 * то необходимо генерировать исключение IllegalArgumentException с соответствующим сообщением
 * (в скобках будет указано какую строку-сообщение необходимо передавать в конструктор при генерации исключения):
 */
public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    /**
     * Метод проверят пароль по правилам:
     *  1. Если password null, то выбросить исключение "Password can't be null";
     *  2. Длина пароля находится в диапазоне [8, 32],
     *     если нет то "Password should be length [8, 32]";
     *  3. Пароль содержит хотя бы один символ в верхнем регистре,
     *     если нет то "Password should contain at least one uppercase letter");
     *  4. Пароль содержит хотя бы один символ в нижнем регистре,
     *     если нет то "Password should contain at least one lowercase letter";
     *  5. Пароль содержит хотя бы одну цифру,
     *     если нет то"Password should contain at least one figure");
     *  6. Пароль содержит хотя бы один спец. символ (не цифра и не буква),
     *     если нет то "Password should contain at least one special symbol");
     *  7. Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user.
     *     Без учета регистра, значит что, например, ни qwerty ни QWERTY ни qwErty и т.п.
     *     если да, то "Password shouldn't contain substrings: qwerty, 12345, password, admin, user".
     * @param password Пароль
     * @return Вернет пароль или выбросит исключение.
     */
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            hasUpCase = Character.isUpperCase(symbol) ? true : hasUpCase;
            hasLowCase = Character.isLowerCase(symbol) ? true : hasLowCase;
            hasDigit = Character.isDigit(symbol) ? true : hasDigit;
            hasSpecial = !Character.isLetterOrDigit(symbol) ? true : hasSpecial;
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one uppercase letter"
            );
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one lowercase letter"
            );
        }
        if (!hasDigit) {
            throw new IllegalArgumentException(
                    "Password should contain at least one figure"
            );
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException(
                    "Password should contain at least one special symbol"
            );
        }

        String[] notAllowedSequence = {"qwerty", "12345", "password", "admin", "user"};
        String passwordLowCase = password.toLowerCase();
        for (String seq: notAllowedSequence) {
            if (passwordLowCase.contains(seq)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user"
                );
            }
        }
        return password;
    }
}