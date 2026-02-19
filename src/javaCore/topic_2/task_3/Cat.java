package javaCore.topic_2.task_3;

public class Cat extends Animal{
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка " + getName() + " издает звук");
    }
}
