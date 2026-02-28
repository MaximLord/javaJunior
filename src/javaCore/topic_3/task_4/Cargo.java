package javaCore.topic_3.task_4;

public class Cargo {
    private final String name;
    private final double weight;
    private final CargoType type;


    public Cargo(String name, double weight, CargoType type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() { return weight; }
    public CargoType getType() { return type; }
    public String getName() { return name; }
}
