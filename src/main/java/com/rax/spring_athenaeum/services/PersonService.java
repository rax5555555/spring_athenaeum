package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.form.PersonForm;
import com.rax.spring_athenaeum.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllUsers();
    Person getPerson(Long productId);
    void addPerson(Person person);
}
