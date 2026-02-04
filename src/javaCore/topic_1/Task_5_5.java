package javaCore.topic_1;

//Слова на букву: Дан список слов. С помощью итератора удали все слова, которые начинаются на букву "A" (регистр не важен).
//Назад в будущее: Создай список из 10 чисел. Используя ListIterator, дойди до конца списка, а затем выведи элементы в обратном порядке от конца к началу.
//Вставка в процессе: Создай список имен. С помощью ListIterator, если встретишь имя "Admin", сразу после него вставь строку "--- Logged In ---" (используй метод .add() итератора).

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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


    }
}
