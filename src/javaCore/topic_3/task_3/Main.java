package javaCore.topic_3.task_3;

//Generics: «Универсальное хранилище данных»
//Задача: Создать класс-контейнер, который может хранить любой тип объекта.
//Класс Box<T>: Создайте generic-класс с полем типа T. Добавьте методы put(T item) и T get().
//Ограничение (Bounded Types): Модифицируйте класс или создайте новый NumericBox<T extends Number>, который принимает только числа. Добавьте метод для сравнения абсолютных значений двух чисел в разных коробках.
//Использование: Протестируйте коробку с Integer, Double и вашим собственным классом (например, User).

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Шоколад");

        NumericBox<Integer> integerBox = new NumericBox<>();
        integerBox.put(10);

        NumericBox<Double> doubleBox = new NumericBox<>();
        doubleBox.put(10.0);

        System.out.println("Абсолютные значения равны? " + integerBox.isEqual(doubleBox));


    }
}
