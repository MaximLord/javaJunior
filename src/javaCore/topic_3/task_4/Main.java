package javaCore.topic_3.task_4;

// Комплексная задача: «Логистический центр»
//Задача: Объединить все концепции.
//Создайте Enum CargoType (CLOTHES, ELECTRONICS, FOOD) с полем «температурный режим».
//Создайте Generic-интерфейс Shippable<T>, который описывает доставку груза.
//Реализуйте класс Truck, где используется static константа MAX_WEIGHT.
//Напишите метод погрузки, который выбрасывает Exception, если вес превышен или тип груза не подходит (например, FOOD требует рефрижератор).

public class Main {
    public static void main(String[] args) {
        Truck simpleTruck = new Truck(false);
        Truck coolTruck = new Truck(true);

        Cargo milk = new Cargo("Milk", 100, CargoType.FOOD);
        Cargo stones = new Cargo("Камни", 1500.0, CargoType.CLOTHES);
        Cargo jeans = new Cargo("Джинсы", 50.0, CargoType.CLOTHES);


        // Пример 1: Успешная отправка
        try {
            simpleTruck.ship(jeans);
        } catch (OverweightException e) {
            System.out.println(e.getMessage());
        }

        // Пример 2: Ошибка веса (Checked)
        try {
            simpleTruck.ship(stones);
        } catch (OverweightException e) {
            System.out.println("Логистическая ошибка: " + e.getMessage());
        }

        // Пример 3: Ошибка рефрижератора (Runtime/IllegalState)
        try {
            simpleTruck.ship(milk);
        } catch (OverweightException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Техническая ошибка: " + e.getMessage());
        } finally {
            System.out.println("Проверка логов завершена.");
        }

    }
}
