package javaCore.topic_2.task_3;

//«Мир животных»: Создайте абстрактный класс Animal с методом makeSound(). Наследуйте от него Dog и Cat.
// Создайте массив Animal[] и поместите туда объекты разных классов.
// В цикле вызовите makeSound() для каждого, чтобы увидеть полиморфизм в действии.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Рекс", 6);
        Animal cat = new Cat("Пушистик", 3);

        List<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
