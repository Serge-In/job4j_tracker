package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 2023-06-18
 * 0.3. Тестирование исключений с junit [#219366  [#219366]]
 * Напишите тесты проверки прерывания на класс подсчета факториала.
 * В тесте нужно использовать метод assertThrows().
 */

public class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }
}