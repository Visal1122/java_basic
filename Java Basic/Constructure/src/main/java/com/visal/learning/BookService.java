package com.visal.learning;

import java.util.Scanner;

public class BookService {
    public Book createBook(){
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("Title : ");
        b.setTitle(sc.next());
        System.out.print("Price : ");
        b.setPrice(sc.nextDouble());
        System.out.print("Author : ");
        b.setAuthor(sc.next());
        return b;
    }

    public Book createBook(String title){
        Scanner sc = new Scanner(System.in);
        Book b = new Book(title);
        System.out.print("Price : ");
        b.setPrice(sc.nextDouble());
        System.out.print("Author : ");
        b.setAuthor(sc.next());
        return b;
    }
    public Book createBook(double price){
        Scanner sc = new Scanner(System.in);
        Book b = new Book(price);
        System.out.print("Title : ");
        b.setTitle(sc.next());
        System.out.print("Author : ");
        b.setAuthor(sc.next());
        return b;
    }
    public Book[] createBooks(int n){
        Book[] books = new Book[n];
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Book "+ (i+1));
            books[i] = createBook();
        }
        return books;
    }
    public Book createBook(String title , double price){
        Scanner sc = new Scanner(System.in);
        Book b = new Book(title , price);
        System.out.print("Author : ");
        b.setAuthor(sc.next());
        return b;
    }
    public Book createBook(String title , double price , String author){
        Scanner sc = new Scanner(System.in);
        Book b = new Book(title , price , author);
        return b;
    }
    public void printBook(Book bk){
        System.out.println("{ Title = " + bk.getTitle() + " Price = " + bk.getPrice() + " Author = " + bk.getAuthor());
    }
    public void printBook(Book[] bk){
        for (Book n : bk){
            System.out.println("{ Title = " + n.getTitle() + " Price = " + n.getPrice() + " Author = " + n.getAuthor());
        }
    }
    public void sortBuyPrice(Book[] bk){
        Book tempBook = new Book();
        for (int i = 0 ; i < bk.length ; i++){
            for(int j = i ; j < bk.length ; j++){
                if(bk[i].getPrice() > bk[j].getPrice()){
                    tempBook = bk[i];
                    bk[i] = bk[j];
                    bk[j] = tempBook;
                }
            }
        }
        printBook(bk);
    }
    public void total(Book[] bk){
        double total = 0;
        for(Book b : bk){
            total+=b.getPrice();
        }
        System.out.println("Total price of the book is : " + total);
    }
}
