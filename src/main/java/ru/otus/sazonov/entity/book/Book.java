package ru.otus.sazonov.entity.book;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Book {
    private int bookId;
    private String bookName;
    private int authorId;
    private int genreId;
}
