package javaCore.topic_1;

import java.util.*;

public class Task_5_2_CycleIterator implements Iterator<String> {
    private List<String> list;
    private int index = 0;

    public Task_5_2_CycleIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty();
    }

    @Override
    public String next() {
        Object element = list.get(index);
        index = (index + 1) % list.size();
        return element.toString();
    }
}
