package javaCore.topic_3.task_5;

public class PaymentTerminal implements PaymentProcessor<Transaction<Currency>> {
    private static final double MIN_AMOUNT_USD = 10.0;

    @Override
    public void process(Transaction<Currency> transaction) throws PaymentException {
        System.out.println("Начало обработки: " + transaction.getId());

        try {
            // 2. Рассчитываем сумму в USD через курс в Enum Currency
            double amountInUsd = convertToUsd(transaction.getAmount(), transaction.getCurrency());

            // 3. Проверка минимальной суммы (выброс своего исключения)
            if (amountInUsd < MIN_AMOUNT_USD) {
                transaction.setStatus(PaymentStatus.FAILED);
                throw new InsufficientFundsException(
                        "Ошибка: Сумма " + amountInUsd + "$ меньше минимума " + MIN_AMOUNT_USD + "$"
                );
            }

            // 4. Использование switch для логики обработки разных валют
            switch (transaction.getCurrency()) {
                case USD:
                    System.out.println("Прямой платеж в долларах...");
                    break;
                case EUR:
                case RUB:
                    System.out.println("Конвертация валюты " + transaction.getCurrency() + " завершена.");
                    break;
                default:
                    // На случай, если в будущем добавят валюту, но забудут прописать её в switch
                    transaction.setStatus(PaymentStatus.FAILED);
                    throw new InvalidCurrencyException("Валюта не поддерживается терминалом.");
            }

            // Если дошли сюда — платеж успешен
            transaction.setStatus(PaymentStatus.COMPLETED);
            System.out.println("Платеж успешно проведен!");

        } catch (InsufficientFundsException | InvalidCurrencyException e) {
            // Перехватываем конкретные ошибки, логируем и пробрасываем дальше
            System.out.println("ЛОГ ОШИБКИ: " + e.getMessage());
            throw e;
        } finally {
            // 5. Выполнится ВСЕГДА, независимо от успеха или ошибки
            System.out.println("ФИНАЛИЗАЦИЯ: Транзакция [" + transaction.getId() + "] завершена.");
            System.out.println("Текущий статус: " + transaction.getStatus());
            System.out.println("------------------------------------------");
        }
    }

    // Вспомогательный статический метод для расчета
    private static double convertToUsd(double amount, Currency currency) {
        return amount / currency.getRate();
    }
}
