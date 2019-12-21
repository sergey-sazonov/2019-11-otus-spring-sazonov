package ru.otus.sazonov.repository.bookAuthor.impl;

import lombok.Data;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.sazonov.entity.bookAuthor.Author;
import ru.otus.sazonov.repository.bookAuthor.AuthorRepository;

import java.sql.Types;

@Data
@Repository
@Transactional
public class AuthorRepositoryImpl implements AuthorRepository {

    private final NamedParameterJdbcOperations jdbcOperations;

    @Override
    public void addAuthor(Author author) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("author_id", author.getAuthorId(), Types.INTEGER)
                .addValue("author_name", author.getAuthorName(), Types.VARCHAR);
        jdbcOperations.update("insert into outs_sazonov.book_authors(author_id, author_name) values(:author_id, :author_name)",
                mapSqlParameterSource);
    }
}
