package oop.task_6;

public class FileNotFoundCustomException extends RuntimeException {
    public FileNotFoundCustomException(String message) {
        super(message);
    }
}
