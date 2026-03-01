package javaCore.topic_3.task_5;

public class InvalidCurrencyException extends PaymentException {
    public InvalidCurrencyException(String message) {
        super(message);
    }
}
