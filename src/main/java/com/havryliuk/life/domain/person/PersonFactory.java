package com.havryliuk.life.domain.person;

import com.github.javafaker.Faker;
import com.havryliuk.life.randomizer.GenderRandomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonFactory {

    private static final int START_AGE = 18;

    @Autowired
    private GenderRandomizer genderRandomizer;

    public Person getNewPerson() {
        String name = new Faker().name().fullName();
        Gender gender = genderRandomizer.get();
        return new Person(name, START_AGE, gender);
    }
}
