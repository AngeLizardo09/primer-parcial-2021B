package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private String name;
    private List<book> books;

    public String getName() {
        return name;
    }
    public List<book>getBooks() {
        return books;
    }
    public void addBook(book Book) {
        books.add(Book);
    }
    public void BookCollection(String name){
        this.name = name;
    }
    public int getStars() {
        int Average = 0;
        for (book Book: books){
            Average += Book.getStars();
        }
        return Average/books.size();
    }
}
