package cycles;

//Вычислить факториал числа 5 (5! = 120) с помощью while.

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;
        while (number > 0) {
            factorial = factorial.multiply(BigInteger.valueOf(number));
            number--;
        }
        System.out.println(factorial);
    }
}
