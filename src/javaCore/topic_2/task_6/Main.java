package javaCore.topic_2.task_6;

//«Умный дом»: Создайте интерфейс SwitchedOn с методами turnOn() и turnOff(). Реализуйте его в классах LightBulb, Fan и TV.
// Создайте класс RemoteControl, который принимает любой объект SwitchedOn и имеет кнопку «Нажать», переключающую состояние прибора.

public class Main {
    public static void main(String[] args) {
        SwitchedOn lamp = new LightBulb();
        SwitchedOn fan = new Fan();

        RemoteControl deviceLamp = new RemoteControl(lamp);
        deviceLamp.button();
        deviceLamp.button();

        RemoteControl deviceFan = new RemoteControl(fan);
        deviceFan.button();
        deviceFan.button();
        deviceFan.button();
    }
}
