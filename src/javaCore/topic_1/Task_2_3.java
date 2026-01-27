package javaCore.topic_1;

//Рисование квадрата: С помощью вложенных циклов for выведите на экран пустой квадрат из символов * заданного размера \(size\times size\).

import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number2; j++) {
                if (i == 0 || i == number - 1 || j == 0 || j == number2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
