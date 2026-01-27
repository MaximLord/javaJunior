package javaCore.topic_1;

//Проверка четности: Напишите программу, которая принимает целое число и выводит сообщение, является ли оно четным или нечетным.

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Четное");
        } else System.out.println("Не четное");
    }
}
