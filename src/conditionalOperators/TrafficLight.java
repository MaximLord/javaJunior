package conditionalOperators;

//По номеру сигнала (1-красный, 2-желтый, 3-зеленый) вывести действие пешехода.

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int color = scanner.nextInt();
        switch (color) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Желтый");
                break;
            case 3:
                System.out.println("Зеленый");
                break;
        }
    }
}
