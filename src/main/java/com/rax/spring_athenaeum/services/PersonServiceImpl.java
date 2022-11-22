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
    public Person getPerson(Long PersonId) {
        return personRepository.getById(PersonId);
    }

    @Override
    public void addPerson(Person Person) {
        Person newPerson = Person.builder()
                .name(Person.getName())
                .age(Person.getAge())
                .build();

        personRepository.save(newPerson);
    }

    @Override
    public void deleteUser(Long PersonId) {
        personRepository.deleteById(PersonId);
    }

    @Override
    public void updateUser(Long userId, Person Person) {
        Person updatePerson = personRepository.getById(userId);
        updatePerson.setName(Person.getName());
        updatePerson.setAge(Person.getAge());
        personRepository.save(updatePerson);
    }
}
