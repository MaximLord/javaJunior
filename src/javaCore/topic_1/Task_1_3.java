package javaCore.topic_1;

//Скидка на покупку: Программа запрашивает сумму покупки. Если сумма больше \(5000\) рублей, начисляется скидка \(10\%\), если больше \(10000\) — \(15\%\). Выведите итоговую сумму к оплате.

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        System.out.println("Введите сумму покупки: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if (sum > 5000 && sum < 9999) {
            double s = sum - (sum * 0.10);
            System.out.println("Сумма со скидкой 10%: " + s);
        } else if ( sum > 10000){
            double s = sum - (sum * 0.15);
            System.out.println("Сумма со скидкой 15%: " + s);
        }
    }
}
