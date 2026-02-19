package javaCore.topic_2.task_1;

//«Инкапсуляция Кошелька»: Создайте класс Wallet.
// У него должно быть приватное поле balance.
// Реализуйте методы для пополнения и снятия денег.
// Добавьте проверку: нельзя снять больше, чем есть на счету, и нельзя положить отрицательную сумму.

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(100);

        wallet.addBalance(25);
        wallet.addBalance(26);

        System.out.println(wallet);

        wallet.deductBalance(100);
        System.out.println(wallet);
        wallet.deductBalance(50);
        System.out.println(wallet);

        wallet.addBalance(-3);
        System.out.println(wallet);

        wallet.deductBalance(500);
        System.out.println(wallet);
    }
}
