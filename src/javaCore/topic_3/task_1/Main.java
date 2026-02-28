package javaCore.topic_3.task_1;

//Enum и Static/Final: «Система управления кофейней»
//Задача: Создать систему для работы с заказами кофе.
//Enum CoffeeSize: Создайте перечисление для размеров кофе (SMALL, MEDIUM, LARGE). Добавьте в него поле milliliters (мл) и метод calculatePrice(double basePrice),
// который увеличивает базовую цену в зависимости от размера (например, x1, x1.5, x2).
//Static: Создайте класс OrderCounter, который содержит статическое поле totalOrders. При создании каждого нового заказа это поле должно увеличиваться.
//Final: Создайте класс CoffeeOrder, где поля orderId и coffeeSize будут final. Попробуйте изменить их после инициализации в конструкторе и посмотрите на ошибку компилятора.

public class Main {
    public static void main(String[] args) {

        double basePrice = 150;

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println("Размер: " + size +
                    ", Объем: " + size.getMilliliters() + "л" +
                    ", Итоговая цена: " + size.calculatePrice(basePrice));
        }

        CoffeeOrder coffee = new CoffeeOrder(CoffeeSize.SMALL);
        CoffeeOrder coffee2 = new CoffeeOrder(CoffeeSize.LARGE);
        CoffeeOrder coffee3 = new CoffeeOrder(CoffeeSize.SMALL);
        CoffeeOrder coffee4 = new CoffeeOrder(CoffeeSize.MEDIUM);

        coffee.printInfo(150);
        coffee2.printInfo(150);
        coffee3.printInfo(150);
        coffee4.printInfo(150);

        System.out.println("Общее количество заказов: " + OrderCounter.getTotalOrders());

    }
}
