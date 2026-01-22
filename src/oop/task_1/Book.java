package oop.task_1;

//Класс Book с приватными полями: title, author, int pages.
//Конструктор с this, геттеры/сеттеры, метод read() возвращает "Читаю [title]".
//Статический счетчик книг static int totalBooks, статический метод getTotalBooks().
//Статический блок выводит "Библиотека открыта".
//Блок инициализации устанавливает pages = 300 по умолчанию.

public class Book {
    private String title;
    private String author;
    private int pages;
    private static int getTotalBooks = 0;
    static String openLibrary;

    private final Lendable lendable;


    public Book(String title, String author, Lendable lendable) {
        this.title = title;
        this.author = author;
        this.lendable = lendable;
        getTotalBooks++;
    }

    static {
        openLibrary = "Библиотека открыта";
    }

    {
        this.pages = 300;
    }

    public static void getOpenLibrary(){
        System.out.println(openLibrary);
    }

    public void read() {
        System.out.println("Читаю " + title);
    }

    public void delegateLend() {
        lendable.lend();
    }

    public static int getTotalBooks() {
        return getTotalBooks;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
