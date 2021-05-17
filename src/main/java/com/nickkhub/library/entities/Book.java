package com.nickkhub.library.entities;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String description;
    private String author;
    private int numberOfPages;
    private int yearOfProduction;
}
