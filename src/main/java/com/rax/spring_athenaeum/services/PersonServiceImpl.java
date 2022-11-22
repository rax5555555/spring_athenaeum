package com.rax.spring_athenaeum.services;

import com.rax.spring_athenaeum.form.PersonForm;
import com.rax.spring_athenaeum.models.Person;
import com.rax.spring_athenaeum.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllUsers() {
        return personRepository.findAll();
    }

    @Override
    public Person getPerson(Long productId) {
        return personRepository.getById(productId);
    }

    @Override
    public void addPerson(Person person) {
        Person newPerson = Person.builder()
                .name(person.getName())
                .age(person.getAge())
                .build();

        personRepository.save(newPerson);
    }

    /*public void save(Person person) {
        jdbcTemplate.update("INSERT INTO Person VALUES(1, ?, ?)", person.getName(), person.getAge());
    }

    public void update(int id, Person updatedPerson) {
        jdbcTemplate.update("UPDATE Person SET name=?, age=? WHERE id=?", updatedPerson.getName(),
                updatedPerson.getAge(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }*/
}
