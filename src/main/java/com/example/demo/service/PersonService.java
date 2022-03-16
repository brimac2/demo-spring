package com.example.demo.service;

import com.example.demo.model.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    //pasiimt info is DB reikia rejectint Repo, jos reikia kaip kintamojo
    private final PersonRepository personRepository;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
//pasikviesim ir per metoda fetchPersons grazins sarasa person

   public List<Person> fetchPersons() {
        return personRepository.findAll();
   }

//   issikvieciam metoda kai ieskom pagal first ir last name:
//public List<Person> fetchPersons() {
//    return personRepository.findFirstByLastNameandFirstName("tast), "test;
//    return personRepository.finAll();
}

