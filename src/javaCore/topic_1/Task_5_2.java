package javaCore.topic_1;

//Циклический итератор: Напишите класс-обертку над списком, который реализует бесконечный итератор.
// Если элементы в списке закончились, next() должен снова возвращать первый элемент.

import java.util.ArrayList;
import java.util.List;

public class Task_5_2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Один");
        arrayList.add("Два");
        arrayList.add("Три");
        arrayList.add("Четыре");
        arrayList.add("Пять");

        Task_5_2_CycleIterator list = new Task_5_2_CycleIterator(arrayList);

        while(!arrayList.isEmpty()){
            System.out.println(list.next());
        }

    }


}


