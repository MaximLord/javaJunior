package primitiveDataTypes;

//Для числа 12345 (тип int) найдите сумму его цифр: 1+2+3+4+5.

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        System.out.println("Вы ввели: " + numbers);
        int sumNumbers = 0;
        while (numbers > 0) {
            sumNumbers += numbers % 10;
            numbers /= 10;
        }
        System.out.println("Сумма всех цифр = " + sumNumbers);
    }
}
