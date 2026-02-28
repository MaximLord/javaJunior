package javaCore.topic_3.task_4;

public interface Shippable <T>{
    void ship(T item) throws OverweightException;
}
