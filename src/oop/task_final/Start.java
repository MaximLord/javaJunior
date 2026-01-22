package oop.task_final;

public class Start {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Clothing trousers = new Clothing("5", "trousers", 100, 0, "xl");
        Electronics computer = new Electronics("1", "computer", 10000, 0, 12);
        Electronics psp = new Electronics("2", "computer", 10000, 0, 12);

        warehouse.addProduct(trousers, 12);
        warehouse.addProduct(computer, 2);
        warehouse.addProduct(psp, 3);

        try {
            System.out.println("--- Попытка продажи ---");
            computer.sell(3); // Ошибка: всего 2 на складе
        } catch (OutOfStockException e) {
            System.err.println("Ошибка при продаже: " + e.getMessage());
        }

        try {
            computer.sell(1); // Успешная продажа
        } catch (OutOfStockException e) {
            System.err.println(e.getMessage());
        }

        // 4. Выводим доступные товары и общую стоимость
        System.out.println("\n--- Доступные товары на 13 января 2026 ---");
        for (Product p : warehouse.getAvailableProducts()) {
            System.out.println(p.getDescription());
        }

        System.out.printf("\nОбщая стоимость товаров на складе: %.2f руб.\n", warehouse.totalValue());
    }
}
