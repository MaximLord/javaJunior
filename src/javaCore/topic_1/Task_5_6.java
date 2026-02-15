package javaCore.topic_1;

//Есть двумерный массив (матрица), например:
//int[][] matrix = {{1, 2}, {3}, {4, 5, 6}};
//Задача — написать итератор, который позволит обойти эту матрицу так, будто это один обычный список: 1, 2, 3, 4, 5, 6.

public class Task_5_6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {},
                {1, 2},
                {4, 5, 6, 7}
        };
        Task_5_6_Matrix itMatrix = new Task_5_6_Matrix(matrix);
        System.out.println(itMatrix.hasNext());
        while(itMatrix.hasNext()){
            System.out.println(itMatrix.next() + " ");
        }
    }
}
