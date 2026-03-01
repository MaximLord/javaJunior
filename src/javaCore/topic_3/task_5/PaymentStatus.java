package javaCore.topic_3.task_5;

public enum PaymentStatus {
    PENDING,
    COMPLETED,
    FAILED;

    public boolean isFinal(){
        return this == COMPLETED || this == FAILED;

    }
}
