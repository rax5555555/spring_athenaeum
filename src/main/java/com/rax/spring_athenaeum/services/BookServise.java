package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.models.Book;
import com.rax.spring_athenaeum.models.Person;

import java.util.List;

public interface BookServise {
    List<Book> getAllBooks();
    Book getBook(Long bookId);
    void addBook(Book book);
    void deleteBook(Long bookId);
    void updateBook(Long bookId, Book book);
}
