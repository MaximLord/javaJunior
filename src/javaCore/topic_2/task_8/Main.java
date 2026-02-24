package javaCore.topic_2.task_8;

//«Двигатель и Машина»: Продемонстрируйте разницу между композицией и агрегацией.
//Создайте класс Car и Engine. Двигатель создается внутри конструктора машины (композиция: машина уничтожается — двигатель тоже).
//Создайте класс Driver. Водитель передается в машину через сеттер (агрегация: водитель может существовать без машины).

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Анатолий");
        Car car = new Car("V8", "BMW");

        System.out.println(driver.getName());
        car.setDriver(driver);
        car.drive();
    }
}
