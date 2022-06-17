package com.havryliuk.life.randomizer;

import com.havryliuk.life.domain.person.Gender;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenderRandomizer implements Randomizer<Gender> {

   public Gender get() {
       Random random = new Random();
       int number = random.nextInt(10000);
       if (number < 4958) {
           return Gender.FEMALE;
       } else {
           return Gender.MALE;
       }
    }
}
