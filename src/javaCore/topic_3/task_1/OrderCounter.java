package javaCore.topic_3.task_1;

public class OrderCounter {
    private static int totalOrders;

    public static void increment(){
        totalOrders++;
    }

    public static int getTotalOrders() {
        return totalOrders;
    }
}
