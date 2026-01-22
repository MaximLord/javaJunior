package oop.task_2.bank;

//Класс Account в пакете bank.
//Приватное поле private double balance.
//Public метод deposit(double amount) — только если amount > 0.
//Default метод calculateInterest() (доступен только в пакете) — возвращает balance * 0.05.
//Private метод validatePin(int pin) — true если pin == 1234.
//Public метод withdraw(double amount, int pin) — проверяет pin и balance.

public class Account {
    private String log;
    private double balance;
    private int pin;
    private double amount;

    public Account(String log, double balance, int pin, double amount) {
        this.log = log;
        this.balance = balance;
        this.pin = pin;
        this.amount = amount;
    }

    public Account(String log, double balance, int pin) {
        this(log, balance, pin, 0.0);
    }

    //Public метод withdraw(double amount, int pin) — проверяет pin и balance.
    public void withdraw(String log, int pin) {
        if (validatePin(log, pin)) {
            calculateInterest();
        } else System.out.println("Неверно введен логин или пароль");

    }

    //Private метод validatePin(int pin) — true если pin == 1234.
    private boolean validatePin(String log, int pin) {
        return this.log.equals(log) && this.pin == pin;
    }

    //Default метод calculateInterest() (доступен только в пакете) — возвращает balance * 0.05.
    private void calculateInterest() {
        System.out.println("Ваш баланс: " + balance);
        System.out.println("Ваш pin: " + pin);
        deposit(amount);
        System.out.println("Так же ваши накопления: " + amount);
    }

    //Public метод deposit(double amount) — только если amount > 0.
    public double deposit(double amount) {
        if (balance > 0) {
            double balanceAndAmount = balance * 0.05;
            this.amount = balanceAndAmount - balance;
        } else System.out.println("У вас нулевой или отрицательный баланс");
        return amount;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}
