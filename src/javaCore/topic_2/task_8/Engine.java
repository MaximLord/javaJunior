package javaCore.topic_2.task_8;

//Композиция (жесткая связь)

public class Engine {
    private String title;

    public Engine(String title) {
        this.title = title;
    }

    public void starting() {
        System.out.println("Двигатель запустился");
    }
}
