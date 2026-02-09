package org.itmo.lab1.lab2;

public class Book {

    private String title;

    private String author;

    private int year;

    private int pages;

    private double price;

    public Book(){

    this.title = "Test name for getTitle";

    this.author = "";

        this.year = 2026;

        this.pages = 100;

        this.price = 1000;
    }

    public Book(String title, String author, int year, int pages, double price){

        this.title = title;

        this.author = author;

        this.year = year;

        this.pages = pages;

        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args){

    //демонстрация геттеров

        Book book1 = new Book();
        System.out.println(book1.getTitle());

        //демонстрация сеттеров

        book1.setTitle("Test name for setTitle");
        book1.setAuthor("");
        book1.setYear(2026);
        book1.setPages(100);
        book1.setPrice(1000);

        System.out.println(book1.toString());

        //стандартный вывод

        Book book2 = new Book("Искусство программирования", "Дональд Кнудт", 2025, 1000, 8000.70);

        System.out.println(book2.title + "," + book2.author + "," + book2.year + "," + book2.pages + "," + book2.price);

        //вывод через toString

        System.out.println(book2.toString());
    }

}
