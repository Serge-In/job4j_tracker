package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 2024-03-13
 * 6. Подсчет функции в диапазоне. [#24251]
 * реализовать метод подсчета функции в диапазоне от start до end (не включаем в диапазон).
 * 2. Реализации функций в тестах:
 * - линейная;
 * - квадратичная; Квадратичная функция — целая рациональная функция второй степени вида f ( x ) = (a x)^2 + (b x) + c , где a ≠ 0 и a , b , c ∈ R
 * - показательная (y = a^x, где a - постоянная). Например, в виде лямбды - x -> Math.pow(2, x)
 */
import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 5, x -> Math.pow(2 * x, 2) + 2 * x + 3);
        List<Double> expected = Arrays.asList(23D, 45D, 75D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenExponentialFunctionThenExponentialResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(1, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D);
        assertThat(result).containsAll(expected);
    }
}
