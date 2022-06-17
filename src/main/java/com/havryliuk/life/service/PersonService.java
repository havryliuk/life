package com.havryliuk.life.service;

import com.havryliuk.life.domain.person.Person;
import com.havryliuk.life.domain.person.PersonFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonFactory personFactory;

    public Person getNewPerson() {
        Person person = personFactory.getNewPerson();
        log.info("Created new person: {}", person);
        return person;
    }
}
