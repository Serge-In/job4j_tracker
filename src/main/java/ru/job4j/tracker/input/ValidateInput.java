package ru.job4j.tracker.input;

/**
 * 2023-12-08
 * в родительском классе input.Console нет валидации вводимого значения,
 * для этого создаем этот класс с переопределением метода askInt
 */
public class ValidateInput extends Console {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }
}
