package com.example.StaccChallange.Stacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(path = "/get/person/",produces  = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}

