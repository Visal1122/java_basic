package com.visal.learning;

import java.util.Scanner;

public class ConstructurePractice {
    public static void main(String[] args) {
        BookService bookService = new BookService();
//        Book book = bookService.createBook("Lol" , 12);
//        bookService.printBook(book);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of book you wanna add : ");
        int num = sc.nextInt();
        Book[] books = bookService.createBooks(num);
        bookService.printBook(books);
        bookService.sortBuyPrice(books);
        bookService.total(books);
    }
}
