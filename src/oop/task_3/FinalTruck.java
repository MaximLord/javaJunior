package oop.task_3;

//Класс FinalTruck extends Vehicle — final класс, нельзя наследовать дальше.

public final class FinalTruck extends Vehicle{

    public FinalTruck(int speed) {
        super(speed);
    }

    @Override
    void move() {
        System.out.println("Грузовик едет со скоростью " + speed);
    }

    @Override
    public String toString() {
        return "FinalTruck{" +
                "speed=" + speed +
                '}';
    }
}
