package javaCore.topic_2.task_9;

public class SMS implements Messenger{
    @Override
    public void send(String msg) {
        System.out.println("Отправка письма сообщением на мобильный телефон" + msg);
    }
}
