package com.samuel.ApiPokemon.Persistence.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table (name = "pokemon")
@NoArgsConstructor 
@Data 
public class Pokemon {

    @Id 
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column (name = "imagen_url")
    private String imagen_url;

    @Column (name = "type")
    private String pokemonTipo;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "trainer_id", referencedColumnName = "id")
    private Trainers trainer;

    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable (name = "pokemon_abilities", joinColumns = {@JoinColumn(name = "pokemon_id", referencedColumnName = "id")}
    , inverseJoinColumns = {@JoinColumn(name = "ability_id", referencedColumnName = "id")})
    List<Abilities> abilities;
}
