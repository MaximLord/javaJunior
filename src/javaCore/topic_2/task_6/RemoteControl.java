package javaCore.topic_2.task_6;

public class RemoteControl {
    private SwitchedOn switchedOn;

    public RemoteControl(SwitchedOn device) {
        this.switchedOn = device;
    }

    public void button() {
        if (switchedOn.isOn()) {
            switchedOn.turnOff();
        } else switchedOn.turnOn();
    }
}
