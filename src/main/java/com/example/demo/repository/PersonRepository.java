package com.example.demo.repository;

//kuriam repo

import com.example.demo.model.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//long - nes integer DB;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
// cia su spring ieskome pagal last ir firstame zmones
//@Repository
//List<Person> findFirstByLastNameAndFirstNAme (String firstName, String lastName)
