package javaCore.topic_2.task_9;

public class Telegram implements Messenger{
    @Override
    public void send(String msg) {
        System.out.println("Отправка письма сообщением в личку через телеграм" + msg);
    }
}
