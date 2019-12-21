package ru.otus.sazonov.repository.book.impl;

import lombok.Data;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.sazonov.entity.book.Book;
import ru.otus.sazonov.repository.book.BookRepository;

import java.sql.Types;
import java.util.List;

@Data
@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository {

    private final NamedParameterJdbcOperations jdbcOperations;

    @Override
    public void addBook(Book book) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("book_name", book.getBookName(), Types.VARCHAR)
                .addValue("genre_id", book.getGenreId(), Types.INTEGER)
                .addValue("author_id", book.getAuthorId(), Types.INTEGER);

        jdbcOperations.update("insert into outs_sazonov.books(book_name, genre_id, author_id) values(:book_name, :genre_id, :author_id)",
                mapSqlParameterSource);
    }

    @Override
    public List<Book> getBooks() {
        return jdbcOperations.query("select book_id, book_name, genre_id, author_id from outs_sazonov.books",
                BeanPropertyRowMapper.newInstance(Book.class));
    }
}
