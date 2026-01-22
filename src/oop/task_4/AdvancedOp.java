package oop.task_4;

//Функциональный интерфейс AdvancedOp с методом execute(double x, double y).

@FunctionalInterface
public interface AdvancedOp {
    double execute(double x, double y);
}
