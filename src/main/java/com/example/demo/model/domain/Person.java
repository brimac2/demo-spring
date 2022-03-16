package com.example.demo.model.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//pasiimsim duomenis is DB

@Data
//cia nurodom, kad sita klase pasiektume info is name lenteles tam puslapyje
@Entity(name = "PERSON")

//cia visi lenteles fieldai, id parodo, kad tai unikalus laukas, nes DB negali tureti to pacio lauko
public class Person {
    @Id
    @Column(name = "PID", nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

}
