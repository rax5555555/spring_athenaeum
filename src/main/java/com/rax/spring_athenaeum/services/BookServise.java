package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.models.Book;
import com.rax.spring_athenaeum.models.Person;

import java.util.List;

public interface BookServise {
    List<Book> getAllUsers();
    Person getPerson(Long bookId);
    void addPerson(Book book);
    void deleteUser(Long bookId);
    void updateUser(Long bookId, Book book);
}
