package javaCore.topic_1;

//Определение сезона: Пользователь вводит номер месяца (1–12).
// Используя switch, верните название времени года (Зима, Весна и т.д.).
// Сгруппируйте кейсы (например, 12, 1, 2 — зима).

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mac = scanner.nextInt();
        String per = switch (mac){
            case 1, 2, 12-> "Зима";
            case 3, 4, 5-> "Весна";
            case 6, 7, 8-> "Лето";
            case 9, 10, 11-> "Осень";
            default -> "Нет такого месяца";
        };
        System.out.println(per);
    }
}
