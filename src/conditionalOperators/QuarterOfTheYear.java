package conditionalOperators;

//По номеру месяца (1-12) определить квартал года (if-else).

import java.util.Scanner;

public class QuarterOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if (d >=1 && d <= 3){
            System.out.println("1 квартал");
        } else if (d >= 4 && d <= 6){
            System.out.println("2 квартал");
        } else if (d >= 7 && d <= 9){
            System.out.println("3 квартал");
        } else if (d >= 10 && d <= 12){
            System.out.println("4 квартал");
        }
    }
}
