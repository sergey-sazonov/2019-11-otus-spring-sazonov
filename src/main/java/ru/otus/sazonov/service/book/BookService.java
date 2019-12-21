package ru.otus.sazonov.service.book;

import ru.otus.sazonov.entity.book.Book;
import ru.otus.sazonov.entity.bookAuthor.Author;
import ru.otus.sazonov.entity.bookGenre.Genre;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

     void addBook(Book book);

     void addAuthor(Author author);

     void addGenre(Genre genre);
}
