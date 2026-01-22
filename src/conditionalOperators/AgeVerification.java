package conditionalOperators;

//Проверить возраст: <0 - ошибка, 0-17 - несовершеннолетний, 18-64 - взрослый, 65+ - пенсионер.

import java.util.Scanner;

public class AgeVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if  (y <= 17 && y >= 0){
            System.out.println("Несовершеннолетний");
        } else if (y >= 65) {
            System.out.println("Пенсионер");
        } else {
            System.out.println("Взрослый");
        }
    }
}
