package com.rax.spring_athenaeum.services;

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
    public Person getPerson(Long personId) {
        return personRepository.getById(personId);
    }

    @Override
    public void addPerson(Person person) {
        Person newPerson = Person.builder()
                .name(person.getName())
                .age(person.getAge())
                .build();

        personRepository.save(newPerson);
    }

    @Override
    public void deleteUser(Long personId) {
        personRepository.deleteById(personId);
    }

    @Override
    public void updateUser(Long userId, Person person) {
        Person updatePerson = personRepository.getById(userId);
        updatePerson.setName(person.getName());
        updatePerson.setAge(person.getAge());
        personRepository.save(updatePerson);
    }
}
