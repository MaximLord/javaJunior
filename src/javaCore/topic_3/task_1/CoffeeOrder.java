package javaCore.topic_3.task_1;

public class CoffeeOrder {
    private final int id;
    private final CoffeeSize size;

    public CoffeeOrder(CoffeeSize size) {
        this.size = size;
        OrderCounter.increment();
        this.id = OrderCounter.getTotalOrders();
    }

    public void printInfo(double basePrice) {
        System.out.println("Заказ №" + id +
                " [Размер: " + size +
                ", Цена: " + size.calculatePrice(basePrice) + "]");
    }

}
