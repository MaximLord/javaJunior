package javaCore.topic_2.task_1;

public class Wallet {
    private int balance;

    public Wallet(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(int money) {
        if (money > 0) {
            balance = balance + money;
        } else System.out.println("Нельзя положить отрицательную сумму");

    }

    public void deductBalance(int money) {
        if (money < balance) {
            balance = balance - money;
        } else System.out.println("Нельзя снять больше чем на счету");
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                '}';
    }
}
