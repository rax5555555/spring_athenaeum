package com.rax.spring_athenaeum.models;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class Book {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 50, message = "Name should be between 2 and 30 characters")
    private String name;

    @NotEmpty(message = "Author should not be empty")
    @Size(min = 2, max = 20, message = "Author should be between 2 and 30 characters")
    private String author;
    @Min(value = 0, message = "Age should be greater than 0")
    private int year;

    public Book() {
    }

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
