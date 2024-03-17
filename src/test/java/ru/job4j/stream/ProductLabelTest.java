package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 2024-03-17
 * 4. Перенос методов в Stream API [#279131]
 * Представьте, что у нас есть продукты. Эти продукты описываются моделью Product.
 * Вашей задачей будет создать классе ProductLabel, который будет генерировать ярлыки для продуктов со скидкой.
 * Ярлык описывается следующей моделью данных Label:
 * Скидку мы даем если продукт выходить из срока годности через 3 дня.
 * Для этих расчетов у нас в модели Product есть 2 поля - standard и actual.
 * Первое означает сколько дней можно хранить продукт, а второе - сколько оно фактически хранится на складе.
 * если разница между полем standard и actual находится в пределах от 0 до 3 (включительно обе границы),
 * то нам необходимо дать на продукт скидку 50%.
 * Для этого условия нужно использовать два раза метод filter.
 */
public class ProductLabelTest {
    @Test
    public void whenGeneratedLabels() {
        Label one = new Label("bread", 10);
        Label two = new Label("butter", 40);
        Label three = new Label("cherry", 75);
        Label four = new Label("watermelon", 35);
        List<Product> products = Arrays.asList(
                new Product("bread", 20, 5, 4),
                new Product("butter", 80, 30, 27),
                new Product("orange", 120, 20, 3),
                new Product("coffee", 75, 120, 30),
                new Product("potato", 45, 90, 15),
                new Product("cherry", 150, 10, 8),
                new Product("watermelon", 70, 7, 7)
        );
        ProductLabel generator = new ProductLabel();
        List<String> strings = generator.generateLabels(products);
        List<String> expected = Arrays.asList(one.toString(), two.toString(), three.toString(), four.toString());
        assertThat(strings).hasSameElementsAs(expected);
    }
}