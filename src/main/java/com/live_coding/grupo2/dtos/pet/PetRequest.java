package com.live_coding.grupo2.dtos.pet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PetRequest (
        @NotBlank(message = "Name is required")
        @Size(min = 2, max = 50, message = "Name must contain between 2 and 50 characters")
        String name,

        @Size(min = 2, max = 50, message = "Breed must contain between 2 and 50 characters")
        String breed,

        @NotBlank(message = "Type of animal is required")
        @Size(min = 2, max = 100, message = "Type of animal must contain between 2 and 100 characters")
        String typeOfAnimal,

        Double age,
        Double weight
){
}
