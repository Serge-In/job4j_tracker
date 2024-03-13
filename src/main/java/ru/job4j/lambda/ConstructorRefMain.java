package ru.job4j.lambda;

/**
 * 2024-03-12
 * 4. Ссылки на конструкторы [#504922]
 * FuncInterface modelConstructor = Model::new;
 * вместо реализации интерфейса создается ссылка на конструктор Model(String str){},
 * так как метод function(String s) так же принимает единственный параметр - строку
 * Переменную modelConstructor можно использовать для создания объекта класса Model,
 * то есть это еще один способ вызвать конструктор Model(String str){} этого класса.
 */
public class ConstructorRefMain {
    public static void main(String[] args) {
        FuncInterface modelConstructor = Model::new;
        Model model = modelConstructor.function("Example");
        System.out.println("Значение равно: " + model.getName());
    }
}
