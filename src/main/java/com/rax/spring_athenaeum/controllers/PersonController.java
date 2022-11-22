package com.rax.spring_athenaeum.controllers;

import com.rax.spring_athenaeum.models.Person;
import com.rax.spring_athenaeum.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping()
    public String getPersonPage(Model model) {
        List<Person> Persons = personService.getAllUsers();
        model.addAttribute("Persons", Persons);
        return "people";
    }

    @GetMapping("/{id}")
    public String getUserPage(Model model, @PathVariable("id") Long id) {
        Person Persons = personService.getPerson(id);
        model.addAttribute("Persons", Persons);
        return "show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("Person") Person Person) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("Person") @Valid Person Person,
                         BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "new";

        personService.addPerson(Person);
        return "redirect:/people";
    }

    @PostMapping("/{id}/delete")
    public String deleteUser(@PathVariable("id") Long id) {
        personService.deleteUser(id);
        return "redirect:/people";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable("id") Long id, Person Person) {
        System.out.println("Update!");
        personService.updateUser(id, Person);
        return "redirect:/people";
    }
}
