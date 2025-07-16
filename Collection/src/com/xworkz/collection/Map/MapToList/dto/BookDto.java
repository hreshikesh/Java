package com.xworkz.collection.Map.MapToList.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BookDto {
    private String title;
    private String author;
    private int pages;
    private String genre;
    private double price;
    private boolean hardcover;
    private String language;
    private int year;
    private String publisher;
    private String isbn;
}
