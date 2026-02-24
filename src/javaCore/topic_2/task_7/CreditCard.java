package javaCore.topic_2.task_7;

public class CreditCard extends PaymentMethod implements Refundable {

    public CreditCard() {
        System.out.println("Кредитная карта");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата на сумму " + amount + " прошла успешно");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат на сумму: " + amount);
    }

}
