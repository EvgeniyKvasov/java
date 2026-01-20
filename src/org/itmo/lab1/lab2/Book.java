package org.itmo.lab1.lab2;

public class Book {

    String title;

    String author;

    int year;

    int pages;

    double price;

    public Book(){
    title = "";

    author = "";

    year = 2026;

    pages = 100;

    price = 1000;
    }

    public Book(String title, String author, int year, int pages, double price){

        this.title = title;

        this.author = author;

        this.year = year;

        this.pages = pages;

        this.price = price;

    }

    public static void main(String[] args){

        Book book1 = new Book();
        System.out.println(book1.title);

        Book book2 = new Book("Искусство программирования", "Дональд Кнудт", 2025, 1000, 8000.70);
        System.out.println(book2.title + "," + book2.author + "," + book2.year + "," + book2.pages + "," + book2.price);
    }

}
