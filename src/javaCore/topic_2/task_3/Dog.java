package javaCore.topic_2.task_3;

public class Dog extends Animal {

    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака " + getName() + " издает звук");
    }
}
