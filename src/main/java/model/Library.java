package model;

import enumm.Books;

public class Library {
    private Books books;
    private int noOfCopies;

    public Library(Books books, int noOfCopies) {
        this.books = books;
        this.noOfCopies = noOfCopies;
    }

    public Books getBooks() {
        return books;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }
}
