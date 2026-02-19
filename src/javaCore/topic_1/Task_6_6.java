package javaCore.topic_1;

// Перемножить две матрицы

import java.util.Arrays;
import java.util.Random;

public class Task_6_6 {
    public static void main(String[] args) {
        int[][] matrix_1 = new int[3][3];
        int[][] matrix_2 = new int[3][3];

        Random random = new Random();

        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1.length; j++) {
                matrix_1[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(matrix_1[i]));
        }

        for (int i = 0; i < matrix_2.length; i++) {
            for (int j = 0; j < matrix_2.length; j++) {
                matrix_2[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(matrix_2[i]));
        }

        int[][] multiplicationMatrix = new int[3][3];

        for (int i = 0; i < multiplicationMatrix.length; i++) {
            for (int j = 0; j < multiplicationMatrix[i].length; j++) {
                for (int k = 0; k < matrix_1[i].length; k++) {
                    multiplicationMatrix[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
            }
            System.out.println(Arrays.toString(multiplicationMatrix[i]));
        }
    }
}
