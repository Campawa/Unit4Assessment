package com.example.chelsi.unit4assessment;

/**
 * Created by Chelsi on 12/20/2017.
 */

public class BookModel {

    private String bookTitle;
    private String bookAuthor;
    private int bookYear;

    public BookModel(String bookTitle, String bookAuthor, int bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }
}
