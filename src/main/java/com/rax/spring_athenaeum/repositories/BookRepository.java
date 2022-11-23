package com.rax.spring_athenaeum.repositories;

import com.rax.spring_athenaeum.models.Book;
import com.rax.spring_athenaeum.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
