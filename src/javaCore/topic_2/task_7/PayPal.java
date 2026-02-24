package javaCore.topic_2.task_7;

public class PayPal extends PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Списано с карты: " + amount);
    }
}
