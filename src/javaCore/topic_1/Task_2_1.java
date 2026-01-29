package javaCore.topic_1;

//Таблица умножения: Выведите в консоль таблицу умножения на заданное число \(n\) (от \(1\) до \(10\)).

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            int sumS = sum * i;
            System.out.println(sumS);
        }

    }
}


