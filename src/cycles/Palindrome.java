package cycles;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        String strReverse = new StringBuilder(str).reverse().toString();

        if(str.equals(strReverse)){
            System.out.println("Это палиндром");
        }else System.out.println("Это не палиндром" + " ");
    }
}
