package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        Book book = (Book)obj;
        if (book.title == this.title  && book.author == this.author
                && book.id == this.id) {
            return true;
        }
        return false;
    }
}