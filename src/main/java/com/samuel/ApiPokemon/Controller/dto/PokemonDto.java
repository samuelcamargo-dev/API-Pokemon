package com.samuel.ApiPokemon.Controller.dto;

import lombok.Data;

@Data 
public class PokemonDto {

    private Long id;

    private String name;

    private String imagen_url;

    private String pokemonTipo;

    private Long trainerId;
}