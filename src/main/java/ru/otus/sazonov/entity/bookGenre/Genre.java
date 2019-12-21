package ru.otus.sazonov.entity.bookGenre;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Genre {
    private int genreId;
    private String genreName;
}
