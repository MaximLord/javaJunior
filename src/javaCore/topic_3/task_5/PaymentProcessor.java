package javaCore.topic_3.task_5;

public interface PaymentProcessor <T extends Transaction<?>> {
    void process(T transaction) throws PaymentException;
}
