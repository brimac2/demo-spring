package com.example.demo.controller;

import com.example.demo.model.api.PersonResponse;
import com.example.demo.model.domain.Person;
import com.example.demo.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jdk.jfr.Threshold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;





//pasikuriam repo
@RestController
@RequestMapping(value = "/person")
//apsirasom dokumentacija
@Tag(name= "Person Controller", description = "experience service to fetch person data")


public class PersonController {

    private final PersonService personService;

//    autowired pasirasom kai pasidarem automatiskai konstruktoriu
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    .stream naudojama interacijai per listus, kad nereiktu for rasyt rasom stream
    @GetMapping
    @Operation(summary = "Fetch persons data from data base")
    @ApiResponse(
            responseCode = "300",
            description = "A list of person objects",
            content = @Content(schema = @Schema(implementation = PersonResponse.class)))
    public List<PersonResponse> fetchPersons(){
        List<Person> repositoryPersons = personService.fetchPersons();
        return repositoryPersons.stream()
                .map(p -> new PersonResponse(p.getFirstName(), p.getLastName(), p.getEmail(), p.getPhone()))
                .collect(Collectors.toList());
    }
}
