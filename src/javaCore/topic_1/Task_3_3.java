package javaCore.topic_1;

//Угадай число: Программа генерирует случайное число, а пользователь вводит свои варианты.
// Цикл продолжается до тех пор, пока число не будет угадано.
// Если ввод неверный, программа дает подсказку: "Больше" или "Меньше".

import java.util.Random;
import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tum = scanner.nextInt();
        int mat = random.nextInt(5);



    }
}
