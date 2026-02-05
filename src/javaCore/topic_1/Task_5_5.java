package javaCore.topic_1;

//Слова на букву: Дан список слов. С помощью итератора удали все слова, которые начинаются на букву "A" (регистр не важен).
//Назад в будущее: Создай список из 10 чисел. Используя ListIterator, дойди до конца списка, а затем выведи элементы в обратном порядке от конца к началу.
//Вставка в процессе: Создай список имен. С помощью ListIterator, если встретишь имя "Admin", сразу после него вставь строку "--- Logged In ---" (используй метод .add() итератора).

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task_5_5 {
    public static void main(String[] args) {
        System.out.println("Слова на букву: Дан список слов. С помощью итератора удали все слова, которые начинаются на букву \"A\" (регистр не важен).\n");
        List<String> listStr = new ArrayList<>();
        listStr.add("Максим");
        listStr.add("Даниил");
        listStr.add("Антон");
        listStr.add("Олег");
        listStr.add("андрей");
        System.out.println(listStr);

        Iterator<String> iter = listStr.iterator();

        while (iter.hasNext()) {
            String it = iter.next();
            if (!it.startsWith("А") && !it.startsWith("а")) {
                iter.remove();
                System.out.println(it);
            }
        }

        System.out.println("\nНазад в будущее: Создай список из 10 чисел. Используя ListIterator, дойди до конца списка, а затем выведи элементы в обратном порядке от конца к началу.\n");

        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            listInt.add(i);
        }
        System.out.println(listInt);

        ListIterator<Integer> listIterator = listInt.listIterator();
        while (listIterator.hasNext()) {
            Integer num = listIterator.next();
            System.out.println(num + " ");
        }

        while (listIterator.hasPrevious()) {
            Integer numPrevious = listIterator.previous();
            System.out.println(numPrevious + " ");
        }

        System.out.println("Вставка в процессе: Создай список имен. С помощью ListIterator, если встретишь имя \"Admin\", сразу после него вставь строку \"--- Logged In ---\" (используй метод .add() итератора).");

        List<String> strList = new ArrayList<>();
        strList.add("Admin");
        strList.add("User");
        strList.add("User");
        strList.add("Admin");

        ListIterator<String> it = strList.listIterator();

        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("Admin")) {
                it.add("--- Logged In ---");
            }
        }
        System.out.println(strList);
    }
}
