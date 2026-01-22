package oop.task_3;

//В main: полиморфный массив Vehicle[] = {new Car(100), new Motorcycle(120)}, вызови move() для всех.
//Переопредели toString() в каждом.

public class Main {
    public static void main(String[] args) {

        Vehicle [] vehicle = new Vehicle[4];

        FinalTruck finalTruck = new FinalTruck(60);
        Motorcycle motorcycle = new Motorcycle(120);
        Car car = new Car(90);

        vehicle[0] = finalTruck;
        vehicle[1] = motorcycle;
        vehicle[2] = car;
        vehicle[3] = new Motorcycle(160);

        for (Vehicle v : vehicle){
            int speed = v.speed;
            System.out.println(speed);
        }
    }
}
