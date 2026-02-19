package javaCore.topic_1;

//«Инверсия без буфера»: Разверните массив (первый элемент становится последним, последний — первым) без создания второго массива.
//«Поиск дубликатов»: Проверьте, есть ли в массиве число, которое встречается несколько раз. Выведите количество повторений.
//«Слияние отсортированных»: Даны два массива, уже отсортированных по возрастанию. Объедините их в один массив так, чтобы результат тоже был сразу отсортирован (не используя Arrays.sort).

import java.util.Arrays;
import java.util.Random;

public class Task_6_5 {
    public static void main(String[] args) {
        System.out.println("\n«Инверсия без буфера»: Разверните массив (первый элемент становится последним, последний — первым) без создания второго массива.\n");

        int[] masReverse = new int[10];
        int masLength = masReverse.length;
        Random random = new Random();
        for (int i = 0; i < masLength; i++) {
            masReverse[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(masReverse));

        for (int i = 0; i < masLength / 2; i++) {
            int t = masReverse[i];
            masReverse[i] = masReverse[masLength - 1 - i];
            masReverse[masLength - 1 - i] = t;
        }
        System.out.println(Arrays.toString(masReverse));

        System.out.println("\n«Поиск дубликатов»: Проверьте, есть ли в массиве число, которое встречается несколько раз. Выведите количество повторений.\n");

        int[] masDuplicate = new int[10];
        int masDuplicateLength = masDuplicate.length;
        for (int i = 0; i < masDuplicateLength; i++) {
            masDuplicate[i] = random.nextInt(7);
        }
        boolean[] checked = new boolean[masDuplicate.length];
        System.out.println("Проверка дубликатов:");

        for (int i = 0; i < masDuplicateLength; i++) {
            if (checked[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < masDuplicate.length; j++) {
                if (masDuplicate[i] == masDuplicate[j]) {
                    count++;
                    checked[j] = true;
                }
            }
            System.out.println("Число " + masDuplicate[i] + " -> встретилось " + count + " раз(а)");
        }

        System.out.println("\n«Слияние отсортированных»: Даны два массива, уже отсортированных по возрастанию. Объедините их в один массив так, чтобы результат тоже был сразу отсортирован (не используя Arrays.sort).\n");
        int[] mas1 = {1, 2, 6, 7, 11};
        int[] mas2 = {3, 4, 8, 9, 10};
        int[] mas3 = new int[mas1.length + mas2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < mas1.length && j < mas2.length) {
            if (mas1[i] < mas2[j]) {
                mas3[k] = mas1[i];
                i++;
            } else {
                mas3[k] = mas2[j];
                j++;
            }
            k++;
        }
        while(i < mas1.length){
            mas3[k++] = mas1[i++];
        }
        while(j < mas2.length){
            mas3[k++] = mas2[j++];
        }
        System.out.println(Arrays.toString(mas3));

    }
}
