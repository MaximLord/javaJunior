package javaCore.topic_2.task_10;

import java.util.UUID;

public class DatabaseConnection {
    private static int port;
    private String connectionId;

    //Статический блок инициализации
    static {
        port = 5453;
        System.out.println(">>> Статический блок: Порт настроен на " + port);
    }

    //Обычный блок инициализации
    {
        connectionId = UUID.randomUUID().toString();
        System.out.println(">>> Обычный блок: Сгенерирован ID: " + connectionId);
    }

    public DatabaseConnection() {
        System.out.println("Конструктор: Подключение создано.");
    }

}
