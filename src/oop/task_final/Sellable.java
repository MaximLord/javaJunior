package oop.task_final;

public interface Sellable {
    public boolean isInStock();
    public void sell(int quantity) throws OutOfStockException;
}
