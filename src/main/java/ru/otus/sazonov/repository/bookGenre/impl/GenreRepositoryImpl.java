package ru.otus.sazonov.repository.bookGenre.impl;

import lombok.Data;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.sazonov.entity.bookGenre.Genre;
import ru.otus.sazonov.repository.bookGenre.GenreRepository;

import java.sql.Types;

@Transactional
@Repository
@Data
public class GenreRepositoryImpl implements GenreRepository {

    private final NamedParameterJdbcOperations jdbcOperations;

    @Override
    public void addGenre(Genre genre) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource()
                .addValue("genre_id", genre.getGenreId(), Types.INTEGER)
                .addValue("genre_name", genre.getGenreName(), Types.VARCHAR);
        jdbcOperations.update("insert into outs_sazonov.book_genres(genre_id, genre_name) values(:genre_id, :genre_name)",
                mapSqlParameterSource);
    }
}
