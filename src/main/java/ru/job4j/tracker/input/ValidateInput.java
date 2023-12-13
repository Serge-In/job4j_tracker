package ru.job4j.tracker.input;
import ru.job4j.tracker.output.Output;
/**
 * 2023-12-08
 * в родительском классе input.Console нет валидации вводимого значения,
 * для этого создаем этот класс с переопределением метода askInt
 * 2023-12-09
 * класс ValidateInput - он получает данные из системы ввода до тех пор, пока не введут правильные символы.
 * Источник данных находится в классе ConsoleInput.
 * 2023-12-13
 * 2. Рефакторинг - Шаблон Декоратор для валидатора. [#34117]
 * Произвести рефакторинг кода класса ru.job4j.tracker.ValidateInput способом с обработкой исключения класса NumberFormatException
 */

public class ValidateInput implements Input {
    private final Output out;
    private final Input input;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = input.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }

}