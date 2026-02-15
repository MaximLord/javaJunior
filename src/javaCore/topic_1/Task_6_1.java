package javaCore.topic_1;

//Реверс без доп. массива: Дан массив целых чисел (например, {1, 2, 3, 4, 5}).
// Напишите алгоритм, который развернет его задом наперед ({5, 4, 3, 2, 1}), не создавая второй массив.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_6_1 {
    public static void main(String[] args) {

        Integer[] mas = {1, 2, 3, 4, 5};
        int element = mas.length;

        for(int i=0; i < element/2; i++){
            int temp = mas[i];
            mas[i] = mas[element - 1 - i];
            mas[element - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(mas));
    }
}
