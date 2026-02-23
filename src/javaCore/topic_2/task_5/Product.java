package javaCore.topic_2.task_5;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Вызван родительский конструктор");
    }

    public void info() {
        System.out.println("Родительский метод: " +  name + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
