package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.models.Book;
import com.rax.spring_athenaeum.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookServise{
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Long bookId) {
        return bookRepository.getById(bookId);
    }

    @Override
    public void addBook(Book book) {
        Book newBook = Book.builder()
                .name(book.getName())
                .author(book.getAuthor())
                .year(book.getYear())
                .build();

        bookRepository.save(newBook);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public void updateBook(Long bookId, Book book) {
        Book updateBook = bookRepository.getById(bookId);
        updateBook.setName(book.getName());
        updateBook.setAuthor(book.getAuthor());
        updateBook.setYear(book.getYear());
        bookRepository.save(updateBook);
    }

}
