package javaCore.topic_1;

//Калькулятор валют: Напишите программу, которая принимает код валюты (USD, EUR, GBP, CNY) и сумму в рублях.
// Используя switch (лучше в виде switch expression), выведите сконвертированную сумму.
// Для неизвестного кода выведите сообщение об ошибке.

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите валюту ");
        String mon = scanner.nextLine();

        String curs = switch (mon) {
            case "USD" -> "70 Рублей";
            case "EUR" -> "90 Рублей";
            case "GBP" -> "35 Рублей";
            case "CNY" -> "10 Рублей";
            default -> {
                System.out.println("Предупреждение: Неизвестный ввод");
                yield "Нет такой валюты";
            }
        };
        System.out.println(curs);
    }
}

