package com.visal.learning;

public class Book {
    private String title , author;
    private double price;
    public Book(){
        System.out.println("Book is created");
    }
    public Book(String title){
        this.title = title;
    }
    public Book(double price){
        this.price = price;
    }
    public Book(String title , double price){
        this(title);
        this.price = price;
    }
    public Book(String title , double price , String author){
        this(title , price);
        this.author = author;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >=0){
            this.price = price;
        }
    }
}
