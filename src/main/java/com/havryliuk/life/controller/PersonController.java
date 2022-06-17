package com.havryliuk.life.controller;

import com.havryliuk.life.domain.person.Person;
import com.havryliuk.life.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/new")
    public Person getNewPerson() {
        return personService.getNewPerson();
    }
}
