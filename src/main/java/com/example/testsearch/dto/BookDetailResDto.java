package com.example.testsearch.dto;

import com.example.testsearch.entity.BookDetails;
import com.example.testsearch.entity.Books;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookDetailResDto {

    private Long id;
    private String title;
    private String description;
    private String thumbnail;
    private Long isbn;
    private String bookCount;

    @Builder
    public BookDetailResDto(Books books, BookDetails bookDetails) {
        this.id = books.getId();
        this.title = books.getTitle();
        this.description = bookDetails.getDescription();
        this.thumbnail = bookDetails.getThumbnail();
        this.isbn = books.getIsbn();
        this.bookCount = books.getBookCount();
    }

}