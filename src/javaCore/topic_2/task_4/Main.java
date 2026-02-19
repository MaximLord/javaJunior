package javaCore.topic_2.task_4;

//«Перегрузка vs Переопределение»: Создайте класс Calculator.
//Реализуйте в нем несколько методов add() (перегрузка) для работы с 2 числами, 3 числами и дробными числами.
//Затем создайте подкласс AdvancedCalculator, который переопределяет метод add() для двух чисел, добавляя логирование результата в консоль.

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 числа: " + calculator.add(5, 10));
        System.out.println("3 числа: " + calculator.add(5, 10, 15));
        System.out.println("2 числа: " + calculator.add(5.4, 10.3));

        System.out.println("----------------------------------------------------------------------");

        Calculator advanced = new AdvancedCalculator();
        int res = advanced.add(20, 30);

        double resDouble = advanced.add(5.5, 4.5);
        System.out.println("Результат double: " + resDouble);
    }
}
