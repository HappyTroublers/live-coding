package com.live_coding.grupo2.dtos.pet;

public record PetRequest (

        String name,
        String breed,
        String typeOfAnimal,
        Long age,
        Double weight
){

}
