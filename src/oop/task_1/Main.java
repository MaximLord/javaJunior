package oop.task_1;

//Задача 1: Классы, методы, static, DI
//Создай систему "Библиотека":
//Интерфейс Lendable с методом lend(), внедри через конструктор DI.
//Метод main: создай 2 книги, покажи totalBooks и вызови read().
//Ожидаемый вывод:
//Библиотека открыта
//Читаю "Война и мир"
//Всего книг: 2

public class Main {
    public static void main(String[] args) {
        Book.getOpenLibrary();

        Lendable lendable = () -> System.out.println("Книга выдана");
        Book book = new Book("Война и мир", "Толстой", lendable);
        Book book2 = new Book("Золотая рыбка", "Пушкин", lendable);

        book.read();
        book2.read();

        System.out.println("Всего книг: " + Book.getTotalBooks());

    }
}
