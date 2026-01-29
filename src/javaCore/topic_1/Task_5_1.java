package javaCore.topic_1;

//Фильтрация по длине: Создайте ArrayList со списком имен. Используя Iterator, удалите из списка все имена, длина которых меньше 5 символов.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_5_1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Максим");
        arrayList.add("Николай");
        arrayList.add("Константин");
        arrayList.add("Олег");
        arrayList.add("Юра");

        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            String arr = iterator.next();
            if (arr.length() > 5){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
