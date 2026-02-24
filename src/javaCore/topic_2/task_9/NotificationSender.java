package javaCore.topic_2.task_9;

import java.util.ArrayList;
import java.util.List;

public class NotificationSender {
    private List<Messenger> messengers = new ArrayList();

    public void addMessengers(Messenger messenger) {
        messengers.add(messenger);
    }

    public void sendToAll(String message){
        for(Messenger messenger : messengers){
            messenger.send(message);
        }
    }
}
