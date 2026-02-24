package javaCore.topic_2.task_9;

//«Система уведомлений»: Разработайте систему, где есть класс NotificationSender.
// Он содержит список (массив) интерфейсов Messenger. Интерфейс имеет метод send(String msg).
// Реализуйте мессенджеры для Email, SMS и Telegram. Вызовите рассылку одного сообщения по всем каналам сразу.

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Telegram telegram = new Telegram();
        Email email = new Email();

        NotificationSender notificationSender = new NotificationSender();

        notificationSender.addMessengers(sms);
        notificationSender.addMessengers(email);
        notificationSender.addMessengers(telegram);

        notificationSender.sendToAll(" Привет, как твои дела?");
    }
}
