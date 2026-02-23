package javaCore.topic_2.task_5;

import java.time.LocalDateTime;

public class Electronics extends Product{
    private int warrantyPeriod;
    public Electronics(String name, int price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
        System.out.println("Вызван конструктор ребенка");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Метод ребенка: " + warrantyPeriod);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
