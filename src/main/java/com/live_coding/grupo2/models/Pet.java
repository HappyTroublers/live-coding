package com.live_coding.grupo2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name", nullable = false, length = 50)
    private String name;

    @Column (name = "breed", length = 50)
    private String breed;

    @Column (name = "type_of_animal", nullable = false, length = 100)
    private String typeOfAnimal;

    @Column (name = "age", length = 20)
    private Long age;

    @Column (name = "weight", length = 20)
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id", nullable = false)
    private Owner owner;
}
