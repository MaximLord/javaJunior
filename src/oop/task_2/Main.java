package oop.task_2;

//Создай "Банковский счет":
//В main (другой класс в том же пакете) протестируй deposit, withdraw, calculateInterest.

import oop.task_2.bank.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Maxim", 100, 123);
        Account account2 = new Account("Oleg", 20, 12345, 10);
    account.getBalance();
    account.getLog();
    account.getPin();

    account.withdraw("Maxim",123);


    }
}
