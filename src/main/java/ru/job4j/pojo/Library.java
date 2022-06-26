package ru.job4j.pojo;

import com.sun.source.tree.IfTree;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Java: A Beginner’s Guide", 999);
        Book second = new Book("Master Core", 80);
        Book therd = new Book("Java Guru", 5);
        Book forth = new Book("Clean code", 10000);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = therd;
        books[3] = forth;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getCount());
            }
        }
    }
}
