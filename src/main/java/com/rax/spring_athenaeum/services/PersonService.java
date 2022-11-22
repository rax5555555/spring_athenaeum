package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllUsers();
}
