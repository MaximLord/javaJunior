package oop.task_3;

//Car extends Vehicle — конструктор super(speed), override move(): "Машина едет".

public class Car extends Vehicle{

    public Car(int speed) {
        super(speed);
    }

    @Override
    void move() {
        System.out.println("Машина едет со скоростью " + speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
