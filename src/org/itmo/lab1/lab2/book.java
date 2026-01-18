package org.itmo.lab1.lab2;

public class book {

    String title;

    String author;

    int year;

    int pages;

    double price;

    public book(){
    title = "";

    author = "";

    year = 2026;

    pages = 100;

    price = 1000;
    }

    public book(String title, String author, int year, int pages, double price){

        this.title = title;

        this.author = author;

        this.year = year;

        this.pages = pages;

        this.price = price;

    }

    public static void main(String[] args){

        book book1 = new book();
        System.out.println(book1.title);

        book book2 = new book("Искусство программирования", "Дональд Кнудт", 2025, 1000, 8000.70);
        System.out.println(book2.title + "," + book2.author + "," + book2.year + "," + book2.pages + "," + book2.price);
    }

}
