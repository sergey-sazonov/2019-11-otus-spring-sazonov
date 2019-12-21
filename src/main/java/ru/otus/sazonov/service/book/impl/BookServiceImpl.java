package ru.otus.sazonov.service.book.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.otus.sazonov.entity.book.Book;
import ru.otus.sazonov.entity.bookAuthor.Author;
import ru.otus.sazonov.entity.bookGenre.Genre;
import ru.otus.sazonov.repository.book.BookRepository;
import ru.otus.sazonov.repository.bookAuthor.AuthorRepository;
import ru.otus.sazonov.repository.bookGenre.GenreRepository;
import ru.otus.sazonov.service.book.BookService;

import java.util.List;

@Data
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    @Override
    public void addAuthor(Author author) {
        authorRepository.addAuthor(author);
    }

    @Override
    public void addGenre(Genre genre) {
        genreRepository.addGenre(genre);
    }
}
