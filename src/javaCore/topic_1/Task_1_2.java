package javaCore.topic_1;

//Определение четверти: Даны координаты точки \((x,y)\). С помощью if-else определите, в какой координатной четверти находится эта точка (или лежит ли она на осях).

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1 четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("2 четверть");
        } else if (x > 0 && y < 0) {
            System.out.println("4 четверть");
        } else System.out.println("3 четверть");
    }
}
