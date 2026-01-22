package primitiveDataTypes;

//Введите целое число (int). Проверьте, четное оно или нет, используя оператор %.

import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean n = number %2 == 0;
        System.out.println(n + "\nЕсли вывело true - то число четное");
    }
}
