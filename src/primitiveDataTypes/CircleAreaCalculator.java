package primitiveDataTypes;

//Напишите программу, которая принимает радиус круга (тип double) и вычисляет площадь круга по формуле π * r².

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area = 3.14 * (radius * radius);
        System.out.println("Площадь круга: " + area);

    }
}
