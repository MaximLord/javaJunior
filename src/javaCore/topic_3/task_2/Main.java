package javaCore.topic_3.task_2;

//Exceptions: «Безопасный банковский перевод»
//Задача: Реализовать логику снятия денег со счета с обработкой ошибок.
//Своё исключение: Создайте класс InsufficientFundsException (наследуется от Exception). Оно должно принимать в конструкторе текущий баланс и сумму, которую пытались снять.
//Логика: Напишите метод withdraw(double amount). Если сумма больше баланса — выбрасывайте InsufficientFundsException. Если сумма отрицательная — выбрасывайте стандартный IllegalArgumentException.
//Блок try-catch-finally: В методе main вызовите перевод. В блоке finally обязательно выведите сообщение: «Операция завершена. Благодарим за использование нашего банка».

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(3000);

        try {
            account.withdraw(360);
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена. Благодарим за использование нашего банка");
        }

        try {
            account.withdraw(0);
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена. Благодарим за использование нашего банка");
        }

        try {
            account.withdraw(4000);
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена. Благодарим за использование нашего банка");
        }


    }
}
