package javaCore.topic_1;

//Объединение и сортировка: Даны два отсортированных массива (например, {1, 3, 5} и {2, 4, 6}).
// Объедините их в один третий массив так, чтобы результирующий массив тоже был отсортирован.

import java.util.Arrays;

public class Task_6_3 {
    public static void main(String[] args) {
        int[] mas1 = {1, 2, 6};
        int[] mas2 = {0, 3, 5};
        int[] sum = new int[mas1.length + mas2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < mas1.length && j < mas2.length) {
            if (mas1[i] <= mas2[j]) {
                sum[k] = mas1[i];
                i++;
            } else {
                sum[k] = mas2[j];
                j++;
            }
            k++;
        }

        while(i < mas1.length){
            sum[k++] = mas1[i++];
        }
        while(j < mas2.length){
            sum[k++] = mas2[j++];
        }

        System.out.println(Arrays.toString(sum));

    }
}
