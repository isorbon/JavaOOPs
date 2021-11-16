package com.syntax.class17;

public class BookHW {
    /*
    Write Book class that will have instance variables and 2 Constructors.
     */
    private String name;
    private String author;
    private String genre;
    private int year;

    public BookHW() {
    }

    public BookHW(String name, String author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public void printBook() {
        System.out.println("The " + genre + " of " + name + " was written in " + year + " by " + author);
    }
}
