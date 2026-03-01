package javaCore.topic_3.task_5;

//«Система обработки платежей в разных валютах».
//Цель — создать мини-каркас системы, которая принимает платежи в разных валютах, проверяет их на валидность и конвертирует в единый отчет.
//Два Enum:
//Currency: со списком валют (USD, EUR, RUB) и полем «курс к доллару».
//PaymentStatus: (PENDING, COMPLETED, FAILED) с методом, который проверяет, является ли статус «конечным».
//Исключения:
//Собственное исключение InsufficientFundsException (если не хватает денег).
//Собственное исключение InvalidCurrencyException (если валюта не поддерживается).
//Generics:
//Интерфейс Processor<T>, который умеет обрабатывать объект типа T.
//Класс Transaction<C>, где C — это тип валюты из вашего Enum.
//Static & Final:
//Константы для минимальной суммы платежа.
//Статический метод для логирования операций.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем экземпляр нашего терминала
        PaymentTerminal terminal = new PaymentTerminal();

        // 2. Используем Generics в коллекции для хранения транзакций
        List<Transaction<Currency>> transactions = new ArrayList<>();

        // Добавляем разные сценарии:
        transactions.add(new Transaction<>(100.0, Currency.USD)); // Успешный (100$)
        transactions.add(new Transaction<>(5.0, Currency.USD));   // Ошибка (меньше 10$)
        transactions.add(new Transaction<>(5000.0, Currency.RUB)); // Успешный (после конвертации > 10$)
        transactions.add(new Transaction<>(1.0, Currency.EUR));   // Ошибка (слишком мало)

        System.out.println("=== ЗАПУСК СИСТЕМЫ ОБРАБОТКИ ПЛАТЕЖЕЙ ===\n");

        // 3. Цикл обработки транзакций
        for (Transaction<Currency> tx : transactions) {
            try {
                // Пытаемся обработать транзакцию
                terminal.process(tx);
            } catch (PaymentException e) {
                // Если возникла наша ошибка (недостаточно средств или валюта)
                System.err.println("Отказ в транзакции: " + e.getMessage());
            } catch (Exception e) {
                // На случай непредвиденных ошибок (Runtime)
                System.err.println("Критический сбой системы: " + e.getMessage());
            }
            System.out.println(); // Пустая строка для читаемости лога
        }

        // 4. Итоговый отчет (использование метода из Enum)
        System.out.println("=== ИТОГОВЫЙ ОТЧЕТ ===");
        for (Transaction<Currency> tx : transactions) {
            String result = tx.getStatus().isFinal() ? "ЗАВЕРШЕНА" : "В ПРОЦЕССЕ";
            System.out.println("ID: " + tx.getId() + " | Статус: " + tx.getStatus() + " | [" + result + "]");
        }
    }
}