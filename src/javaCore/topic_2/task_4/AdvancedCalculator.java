package javaCore.topic_2.task_4;

public class AdvancedCalculator extends Calculator{
    @Override
    public int add(int x, int y) {
        int result = super.add(x, y);
        System.out.println("Сложение " + x + " + " + y + " = " + result);
        return result;
    }
}
