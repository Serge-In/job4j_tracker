package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import  ru.job4j.tracker.output.*;

/**
 * 2023-12-14
 * 2.1. Тест на ValidateInput [#311887]
 * 1. Напишите тест на класс ValidateInput.
 * - правильный ввод -  тут все просто, в массиве будет любое число в виде строки, валидатор распарсит его до числа и вернет в качестве значения;
 * - многократный правильный ввод - Ваша задача в массив поместить несколько чисел в виде строки, последовательно вызывать следующий код:
 * столько раз, сколько значений в массиве Вы поместите. Сделайте чтобы значения были разными, чтобы при каждой проверке увидеть разницу в извлекаемых значениях;
 * - ввод отрицательного числа - тут все просто, поместите отрицательное число в виде строки в массив,
 * для валидатора такое значение валидное и метод вернет это отрицательное число.
 */
class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new ru.job4j.tracker.output.Stub();
        Input in = new Mock(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new ru.job4j.tracker.output.Stub();
        Input in = new Mock(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenMultiInput() {
        Output output = new ru.job4j.tracker.output.Stub();
        String[] arrInput = {"1", "3"};
        int[] arrRequest = {1, 3};
        Input in = new Mock(arrInput);
        ValidateInput input = new ValidateInput(output, in);
        for (int i = 0; i <  arrInput.length; i++) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(arrRequest[i]);
        }
    }

    @Test
    void whenValidMinusOneInput() {
        Output output = new ru.job4j.tracker.output.Stub();
        Input in = new Mock(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}