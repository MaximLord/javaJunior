package oop.task_6;

//Файловый менеджер с обработкой ошибок:
//Создай checked исключение FileNotFoundCustomException extends Exception.
//Unchecked InvalidPathRuntimeException extends RuntimeException.
//Метод readFile(String path) throws FileNotFoundCustomException:
//Если path == null → throw InvalidPathRuntimeException.
//Если path.length() < 3 → throw FileNotFoundCustomException("Слишком короткий путь").
//В main: try-catch-finally с 3 тестами путей.
//Multi-catch для RuntimeException | IOException.
//Прокинь throws в сигнатуру main.

public class Main {
    public static void main(String[] args) {

    }
}
