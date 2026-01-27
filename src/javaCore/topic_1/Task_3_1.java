package javaCore.topic_1;

//Сумма цифр: Дано целое положительное число. Используя цикл while, найдите сумму всех его цифр (используйте операции % 10 и / 10).

import java.util.Scanner;

public class Task_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
