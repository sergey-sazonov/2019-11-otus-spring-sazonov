create schema outs_sazonov;

create table outs_sazonov.book_authors(
        author_id   integer PRIMARY KEY
    ,   author_name varchar not null
);

create table outs_sazonov.book_genres(
        genre_id   integer PRIMARY KEY
    ,   genre_name varchar not null
)

create table outs_sazonov.books(
    book_id     serial
,   book_name   varchar not null
,   genre_id    integer REFERENCES outs_sazonov.book_genres (genre_id)
,   author_id   integer REFERENCES outs_sazonov.book_authors (author_id)
);


select * from outs_sazonov.book_authors