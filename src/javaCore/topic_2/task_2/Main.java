package javaCore.topic_2.task_2;

//«Цепочка вызовов (this)»: Создайте класс PizzaBuilder. Реализуйте в нем методы addCheese(), addPepperoni(), setSize(String size).
// Сделайте так, чтобы каждый метод возвращал this, позволяя вызывать их в одну строку: new PizzaBuilder().setSize("Large").addCheese().addPepperoni();.

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("medium");
        pizzaBuilder.addCheese().addPeperoni().buildPizza();
    }
}
