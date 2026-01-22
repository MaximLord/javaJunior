package oop.task_5;

//Класс Pizzeria со static вложенным классом Order (int id, Pizza pizza).

public class Pizzeria {
    static class Order {
        private int id;
        private Pizza pizza;

        public Order(int id, Pizza pizza) {
            this.id = id;
            this.pizza = pizza;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", pizza=" + pizza +
                    '}';
        }
    }
}
