package javaCore.topic_2.task_8;

//Композиция (жесткая связь) - Двигатель
//Агрегация (слабая связь) - водитель

public class Car {
    private final Engine engine;
    private Driver driver;
    private String name;

    public Car(String engine, String name) {
        this.engine = new Engine("V8");
        this.name = name;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        System.out.println(driver + " сел за руль " + name);
    }

    public void drive() {
        if (driver != null) {
            engine.starting();
        } else System.out.println("Машина не может двигаться без водителя");
        System.out.println("Машина начала движение");
    }

}
