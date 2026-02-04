package javaCore.topic_1;

//Безопасная замена в ListIterator: Используя ListIterator, пройдите по списку целых чисел.
// Если число четное, увеличьте его значение вдвое, а если нечетное — замените его на ноль.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task_5_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int t = it.next();
            if (t % 2 == 0) {
                it.set(t * t);
            } else it.set(0);
        }
        System.out.println(list);


    }
}
