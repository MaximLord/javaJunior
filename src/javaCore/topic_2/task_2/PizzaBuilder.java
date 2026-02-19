package javaCore.topic_2.task_2;

import oop.task_5.Pizza;

public class PizzaBuilder {
    private String size;
    private boolean cheese;
    private boolean peperoni;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder setSize() {
        this.size = size;
        return this;
    }

    public PizzaBuilder addPeperoni() {
        this.peperoni = true;
        System.out.println("Пепперони добавлены");
        return this;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        System.out.println("Сыр добавлен");
        return this;
    }

    public void buildPizza() {
        System.out.println("Пицца готова! Размер: " + size +
                ", Сыр: " + cheese +
                ", Пепперони: " + peperoni);
    }
}
