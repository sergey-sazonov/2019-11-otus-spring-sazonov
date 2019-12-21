package ru.otus.sazonov.repository.book;

import ru.otus.sazonov.entity.book.Book;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);

    List<Book> getBooks();

}
