package ru.netology.product;

public class Book extends Product {

    private String bookName;
    private String author;

    public Book(int id, String name, int price, String bookName, String author) {
        super(id, name, price);
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public void use() {
        System.out.println("Читаем книгу:" + bookName);
    }

    @Override
    public boolean isTooExpensive() {
        boolean result;
        if (price > 10_000) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
