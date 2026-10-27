package com.samuel.ApiPokemon.Controller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data 
public class PokemonDto {

    private Long pokemonId;

    private String pokemonNombre;

    private String pokemonTipo;

}
