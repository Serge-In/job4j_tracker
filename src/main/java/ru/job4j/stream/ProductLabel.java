package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .flatMap(Stream::ofNullable)
                .filter(product -> product.getStandard() - product.getActual() >= 0)
                .filter(product -> product.getStandard() - product.getActual() <= 3)
                .map(product -> new Label(product.getName(), product.getPrice() / 2))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}