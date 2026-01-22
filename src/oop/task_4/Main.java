package oop.task_4;

//Классы Add, Multiply implements Operation (реализуй operate(int a, int b)).
//Используй лямбду для AdvancedOp: (x,y) -> x/y.
//Приведи тип: ((Add)ops[0]).operate(2,3).

public class Main {
    public static void main(String[] args) {
        Operation[] mass = {new Add(), new Multiply()};
        AdvancedOp advancedOp = (x, y) -> x / y;
        System.out.println(advancedOp);

        // 3. Явное приведение типа элемента массива к классу Add и вызов метода
        // Это сработает, так как ops[0] действительно является экземпляром Add
        double resultAdd = ((Add) mass[0]).execute(2, 3);
        double resultMultiply = ((Multiply) mass[1]).execute(3,3);

        // Вывод результатов
        System.out.println("Результат Add через приведение: " + resultAdd); // 5.0
        System.out.println("Результат Add через приведение: " + resultMultiply); // 9.0
        System.out.println("Результат Multiply через массив: " + mass[1].execute(2, 3)); // 6.0
        System.out.println("Результат AdvancedOp (лямбда): " + advancedOp.execute(10, 2)); // 5.0
    }

}
