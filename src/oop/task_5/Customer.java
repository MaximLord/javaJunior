package oop.task_5;

//Non-static inner класс Customer { private String name; }.

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Клиент " + name + " пришел в пиццерию");
    }
}
