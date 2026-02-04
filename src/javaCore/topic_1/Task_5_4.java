package javaCore.topic_1;

//Легкие задачи на понимание Итератора
//Простой фильтр: Создай ArrayList с целыми числами. Используя итератор, удали все отрицательные числа из списка.
//Поиск и замена: Пройдись по списку строк с помощью ListIterator. Если строка — "Java", замени её на "Java Core", используя метод .set().
//Каждый второй: Напиши программу, которая с помощью итератора выводит в консоль только каждый второй элемент списка.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task_5_4 {
    public static void main(String[] args) {
        System.out.println("Простой фильтр: Создай ArrayList с целыми числами. Используя итератор, удали все отрицательные числа из списка.\n");
        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(-2);
        intArr.add(3);
        intArr.add(-4);
        intArr.add(5);
        System.out.println("Старый список: \n" + intArr);

        Iterator<Integer> intIterator = intArr.iterator();
        while (intIterator.hasNext()) {
            int number = intIterator.next();
            if (number < 0) {
                intIterator.remove();
            }
        }
        System.out.println("Новый список: \n" + intArr);

        System.out.println("\nПоиск и замена: Пройдись по списку строк с помощью ListIterator. Если строка — \"Java\", замени её на \"Java Core\", используя метод .set().\n");
        List<String> strArr = new ArrayList<>();
        strArr.add("Java");
        strArr.add("JavaScript");
        strArr.add("Java");
        strArr.add("JavaScript");
        strArr.add("JavaScript");
        strArr.add("Java");

        System.out.println(strArr);
        ListIterator<String> strIterator = strArr.listIterator();
        while (strIterator.hasNext()) {
            String java = strIterator.next();
            if (java.equals("Java")) {
                strIterator.set("Java Core");
            }
        }
        System.out.println(strArr);

        System.out.println("Каждый второй: Напиши программу, которая с помощью итератора выводит в консоль только каждый второй элемент списка.\n");
        List<String> list = new ArrayList();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");
        list.add("Шесть");
        System.out.println(list);

        Iterator <String> it = list.iterator();

        while(it.hasNext()){
            String t = it.next();
            if(it.hasNext()){
                System.out.println(t);
            }
            it.next();
        }
    }
}
