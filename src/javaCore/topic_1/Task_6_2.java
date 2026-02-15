package javaCore.topic_1;

//Поиск "Ступеньки": Дан двумерный массив (матрица) целых чисел.
// Найдите строку, сумма элементов которой является максимальной, и выведите её индекс.

public class Task_6_2 {
    public static void main(String[] args) {
        int[][] mas = {
                {1, 2, 3},
                {1, 9, 3},
                {2, 2, 3}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < mas.length; i++) {
            int sumRow = 0;

            for (int j = 0; j < mas[i].length; j++) {
                sumRow += mas[i][j];
            }
            if (sumRow > maxSum) {
                maxSum = sumRow;
                maxIndex = i;
            }
        }
        System.out.println("Индекс строки с макс. суммой: " + maxIndex);
        System.out.println("Сама сумма: " + maxSum);
    }
}
