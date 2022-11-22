package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.models.Person;
import com.rax.spring_athenaeum.repositories.BookRepository;
import com.rax.spring_athenaeum.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl{
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /*@Override
    public List<Person> getAllUsers() {
        return PersonRepository.findAll();
    }

    @Override
    public Person getPerson(Long PersonId) {
        return PersonRepository.getById(PersonId);
    }

    @Override
    public void addPerson(Person Person) {
        Person newPerson = Person.builder()
                .name(Person.getName())
                .age(Person.getAge())
                .build();

        PersonRepository.save(newPerson);
    }

    @Override
    public void deleteUser(Long PersonId) {
        PersonRepository.deleteById(PersonId);
    }

    @Override
    public void updateUser(Long userId, Person Person) {
        Person updatePerson = PersonRepository.getById(userId);
        updatePerson.setName(Person.getName());
        updatePerson.setAge(Person.getAge());
        PersonRepository.save(updatePerson);
    }*/
}
