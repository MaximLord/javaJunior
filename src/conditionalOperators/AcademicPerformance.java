package conditionalOperators;

//По баллам (0-100) вывести оценку: 90-100=A, 80-89=B, 70-79=C, 60-69=D, <60=F.

import java.util.Scanner;

public class AcademicPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 90) {
            System.out.println("A");
        } else if (n > 80 && n < 89) {
            System.out.println("B");
        } else if (n > 70 && n < 79) {
            System.out.println("C");
        } else if (n > 60 && n < 69) {
            System.out.println("D");
        } else if (n < 60) {
            System.out.println("F");
        }
    }
}
