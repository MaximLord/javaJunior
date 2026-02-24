package javaCore.topic_2.task_7;

//«Платежные системы»: Создайте абстрактный класс PaymentMethod с методом processPayment(double amount).
// Реализуйте его в классах CreditCard и PayPal. Добавьте интерфейс Refundable (с методом refund) только для тех способов оплаты,
// которые поддерживают возврат средств.

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        creditCard.processPayment(200);
        creditCard.refund(100);

        payPal.processPayment(200);

    }
}
