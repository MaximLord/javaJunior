package javaCore.topic_3.task_5;

import java.util.UUID;

public class Transaction <C> {
    private final String id;
    private final double amount;
    private final C currency;
    private PaymentStatus status;

    public Transaction(double amount, C currency) {
        this.id =  UUID.randomUUID().toString();
        this.amount = amount;
        this.currency = currency;
        this.status = PaymentStatus.PENDING;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Транзакция [%s]: %.2f (%s), статус: %s",
                id, amount, currency, status);
    }

    public String getId() {
        return id;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public C getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
