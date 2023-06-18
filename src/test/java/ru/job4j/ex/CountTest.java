package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 2023-06-18
 * 0.3. Тестирование исключений с junit [#219366  [#219366]]
 * В тесте нужно использовать метод assertThrows().
 */

public class CountTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(10, 2);
                });
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }
}