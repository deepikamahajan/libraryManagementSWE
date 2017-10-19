package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

import hu.uni.miskolc.iit.sweng.libraryManagement.model.Author;

import java.util.List;

public class Book {

    private List<Author> author;
    private final String title;

    public Book(List<Author> author, String title) {
        this.author = author;
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

}
