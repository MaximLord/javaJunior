package javaCore.topic_2.task_9;

public class Email implements Messenger{
    @Override
    public void send(String msg) {
        System.out.println("Отправка письма сообщением на почту" + msg);
    }
}
