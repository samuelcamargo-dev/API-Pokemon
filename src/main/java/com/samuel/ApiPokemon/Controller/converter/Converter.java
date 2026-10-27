package com.samuel.ApiPokemon.Controller.converter;

import org.springframework.stereotype.Component;

import com.samuel.ApiPokemon.Controller.dto.PokemonDto;
import com.samuel.ApiPokemon.Persistence.model.Pokemon;

@Component 
public class Converter {

    public PokemonDto converterDto(Pokemon pokemon) {

        PokemonDto pokemonDto = new PokemonDto();
        
        pokemonDto.setPokemonId(pokemon.getPokemonId());
        pokemonDto.setPokemonNombre(pokemon.getPokemonNombre());
        pokemonDto.setPokemonTipo(pokemon.getPokemonTipo());

        return pokemonDto;
    }

    public Pokemon converterEntity(PokemonDto pokemonDto) {

        Pokemon pokemon = new Pokemon();
        
        pokemon.setPokemonId(pokemonDto.getPokemonId());
        pokemon.setPokemonNombre(pokemonDto.getPokemonNombre());
        pokemon.setPokemonTipo(pokemonDto.getPokemonTipo());

        return pokemon;
    }
}
