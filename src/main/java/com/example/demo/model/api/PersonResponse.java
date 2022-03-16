package com.example.demo.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//lamboko konstruktorius
@AllArgsConstructor
public class PersonResponse {

    @Schema(description = "Person first name", example = "Brigita")
    private String firstName;
    @Schema(description = "Person last name", example = "Macaite")
    private String lastName;
    @Schema(description = "Person email ", example = "gmail@gmail.com")
    private String email;
    @Schema(description = "Person phone number", example = "8625197489")
    private String phone;
}
