package javaCore.topic_3.task_2;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Вводимая сумма не может быть меньше нуля");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств");
        }
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Остаток: " + balance);
        }
    }
}
