package oop.task_5;

//Система "Пиццерия":
//Анонимный класс для Comparator<Pizza> по цене.
//В main: создай Pizza record, Order, Customer, отсортируй по размеру.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static oop.task_5.Size.*;

public class Main {
    public static void main(String[] args) {

        Pizza peperoni = new Pizza("peperoni", LARGE);
        Pizza margarita = new Pizza("margarita", MEDIUM);
        Pizza fourCheese = new Pizza("fourCheese", SMALL);

        List<Pizza> pizzas= new ArrayList<>(List.of(peperoni, margarita, fourCheese));

        Comparator<Pizza> priceComparator = new Comparator<Pizza>() {

            @Override
            public int compare(Pizza p1, Pizza p2) {
                return Integer.compare(p1.size().getPrice(), p2.size().getPrice());
            }
        };

        pizzas.sort(priceComparator);

        Customer customer = new Customer("Egor");
        customer.greet();

        Pizzeria.Order order = new Pizzeria.Order(1, peperoni);
        System.out.println(order);

        for (Pizza pizza : pizzas){
            System.out.println(pizza.name() + " — " + pizza.size().getPrice() + "$");
        }

    }
}
