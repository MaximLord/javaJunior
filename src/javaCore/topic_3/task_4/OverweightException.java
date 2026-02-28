package javaCore.topic_3.task_4;

public class OverweightException extends RuntimeException {
    private double  weight;
    private double maxWeight;

    public OverweightException(double maxWeight, double weight) {
        super("Перегруз! Максимум: " + maxWeight + ", факт: " + weight);
        this.maxWeight = maxWeight;
        this.weight = weight;
    }




}
