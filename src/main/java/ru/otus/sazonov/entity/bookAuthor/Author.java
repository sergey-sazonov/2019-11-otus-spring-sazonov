package ru.otus.sazonov.entity.bookAuthor;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Author {
    private int authorId;
    private String authorName;
}
