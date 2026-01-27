package javaCore.topic_1;

//Банковский вклад: Вклад в банке составляет \(X\) рублей. Ежегодно он увеличивается на \(P\) процентов. Через сколько лет вклад превысит сумму \(Y\)?

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество денег на вкладе");
        int x = scanner.nextInt();
        System.out.println("Введите сумму для накопления");
        int y = scanner.nextInt();
        System.out.println("Введите процент по вкладу");
        int p = scanner.nextInt();

        int year = 0;

        while (x < y) {
            x += p;
            year++;
            System.out.println(x);
        }
        System.out.println("Итераций было: " + year);
    }
}
