package javaCore.topic_1;

//«Максимум и минимум»: Создайте массив из 10 случайных чисел. Найдите в нем самое большое и самое маленькое значение, а затем выведите их разницу.
//«Среднее арифметическое»: Вычислите среднее значение всех элементов массива double. Выведите в консоль только те элементы, которые больше этого среднего.
//«Четный переворот»: Замените все четные числа в массиве на 0, а нечетные — на 1.

import java.util.Arrays;
import java.util.Random;

public class Task_6_4 {
    public static void main(String[] args) {
        System.out.println("\n«Максимум и минимум»: Создайте массив из 10 случайных чисел. Найдите в нем самое большое и самое маленькое значение, а затем выведите их разницу.\n");
        int[] masRand = new int[10];
        int i = 0;

        Random random = new Random();
        while (i < masRand.length) {
            masRand[i] = random.nextInt(100);
            i++;
        }

        int minValue = masRand[0];
        int maxValue = masRand[0];

        for (int j = 1; j < masRand.length; j++) {
            if (masRand[j] < minValue) {
                minValue = masRand[j];
            }
            if (masRand[j] > maxValue) {
                maxValue = masRand[j];
            }
        }
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(Arrays.toString(masRand));
        System.out.println("Разница: " + (maxValue - minValue));

        System.out.println("\n«Среднее арифметическое»: Вычислите среднее значение всех элементов массива double. Выведите в консоль только те элементы, которые больше этого среднего.\n");
        double[] mas = new double[25];
        double sum = 0;
        for (int j = 0; j < mas.length; j++) {
            mas[j] = random.nextDouble(20);
            sum += mas[j];
        }

        double average = sum / mas.length;

        System.out.printf(Arrays.toString(mas) + "\n");
        System.out.println("\nОбщая сумма массива: %.2f " + sum);
        System.out.println("\nСреднее значение массива: " + average);

        System.out.println("Элементы больше среднего: ");
        for (double a : mas) {
            if (a > average) {
                System.out.printf("%.2f ", a);
            }
        }

        System.out.println("\n«Четный переворот»: Замените все четные числа в массиве на 0, а нечетные — на 1.\n");

        //masRand mas
        for (int itr = 0; itr < mas.length; itr++) {
            if ((int) mas[itr] % 2 == 0) {
                mas[itr] = 0.0;
            } else {
                mas[itr] = 1.0;
            }
        }
        System.out.printf("\nПеределанный массив: " + Arrays.toString(mas));

        for (int itr = 0; itr < masRand.length; itr++) {
            if (masRand[itr] % 2 == 0) {
                masRand[itr] = 0;
            } else {
                masRand[itr] = 1;
            }
        }
        System.out.printf("\nПеределанный массив: " + Arrays.toString(masRand));
    }
}

