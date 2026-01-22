package primitiveDataTypes;

//Программа принимает температуру в Цельсиях (double) и переводит в Фаренгейты по формуле F = C * 9/5 + 32.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Введите градусы в цельсиях: ");
        Scanner scanner = new Scanner(System.in);
        double celsia = scanner.nextDouble();
        double farengeit = (celsia * ((double) 9 /5)) + 32;
        System.out.println("В фаренгейтах это = " + farengeit);
    }
}
