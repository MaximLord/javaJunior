package javaCore.topic_1;

//Сумма ряда: Вычислите сумму всех четных чисел в диапазоне от \(1\) до \(N\), где \(N\) вводится пользователем.

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
