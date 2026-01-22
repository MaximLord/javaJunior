package oop.task_3;

//Motorcycle extends Vehicle — final метод wheelie(): "Колесо!".

public class Motorcycle extends Vehicle{

    public Motorcycle(int speed) {
        super(speed);
    }

    @Override
    void move() {
        System.out.println("Мотоцикл едет со скоростью " + speed);
    }

    final void wheelie(){
        System.out.println("Колесо!");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "speed=" + speed +
                '}';
    }
}
