package oop.task_4;

public class Multiply implements Operation{
    @Override
    public double execute(int a, int b) {
        return a * b;
    }

    @Override
    public boolean validate(int a, int b) {
        return Operation.super.validate(a, b);
    }
}
