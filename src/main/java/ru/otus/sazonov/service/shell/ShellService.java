package ru.otus.sazonov.service.shell;

import lombok.Data;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.otus.sazonov.entity.book.Book;
import ru.otus.sazonov.entity.bookAuthor.Author;
import ru.otus.sazonov.entity.bookGenre.Genre;
import ru.otus.sazonov.service.book.BookService;

import java.util.List;

@ShellComponent
@Data
public class ShellService {

    private final BookService bookService;

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod("add Author")
    public void add_author(int authorId, String authorName) {
        Author author = new Author()
                .setAuthorId(authorId)
                .setAuthorName(authorName);
        bookService.addAuthor(author);
    }

    @ShellMethod("add genre")
    public void add_genre(int genreId, String genreName) {
        Genre genre = new Genre()
                .setGenreId(genreId)
                .setGenreName(genreName);
        bookService.addGenre(genre);
    }

    @ShellMethod("add book")
    public void add_book(int authorId, int genreId, String bookName) {
        Book book = new Book()
                .setBookName(bookName)
                .setAuthorId(authorId)
                .setGenreId(genreId);
        bookService.addBook(book);
    }

    @ShellMethod("get books")
    public List<Book> get_books() {
        return bookService.getBooks();
    }
}
