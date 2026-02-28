package javaCore.topic_3.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T> {
    private T item;

    public void put(T item){
        this.item = item;
        System.out.println("В коробку положили: " + item);
    }

    public T get(){
        return item;
    }
}
