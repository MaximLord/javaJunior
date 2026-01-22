package oop.task_final;

public abstract class Product implements Sellable {
    protected String id;
    protected String name;
    protected double price;
    protected int stock; // добавили поле для реализации Sellable

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract String getDescription();

    public double calculateDiscount(double percent) {
        return price * (1 - percent / 100);
    }

    @Override
    public boolean isInStock() {
        return stock > 0;
    }

    @Override
    public void sell(int quantity) throws OutOfStockException {
        if (stock < quantity) {
            throw new OutOfStockException("Недостаточно товара " + name + " на складе!");
        }
        stock -= quantity;
        System.out.println("Продано " + quantity + " шт. товара: " + name);
    }

    public int getStock() { return stock; }
}
