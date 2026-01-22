package oop.task_3;

//Абстрактный класс Vehicle с protected speed, абстрактным move(), методом stop().
abstract class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    abstract void move();

    public void stop(){
        System.out.println("Остановка");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                '}';
    }
}
