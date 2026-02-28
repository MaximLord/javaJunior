package javaCore.topic_3.task_3;

public class NumericBox<T extends Number> {
    private T item;

    public void put(T item){
        this.item = item;
    }

    public boolean isEqual(NumericBox<?> other){
        return Math.abs(this.item.doubleValue()) == Math.abs(other.item.doubleValue());
    }
}
