package javaCore.topic_2.task_6;

public class TV implements SwitchedOn {
    private boolean active = false;

    @Override
    public void turnOn() {
        active = true;
        System.out.println("Включен");
    }

    @Override
    public void turnOff() {
        active = false;
        System.out.println("Выключен");
    }

    @Override
    public boolean isOn() {
        return active;
    }
}
