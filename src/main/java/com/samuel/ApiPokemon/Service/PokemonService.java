package com.samuel.ApiPokemon.Service;

import java.util.List;

import com.samuel.ApiPokemon.Persistence.model.Pokemon;
import com.samuel.ApiPokemon.Persistence.model.Pokemon_Stats;

public interface PokemonService {

    public List<Pokemon> getAllPokemons();

    public Pokemon getPokemonById(Long id);

    public Pokemon createPokemon(Pokemon pokemon);

    public Pokemon updatePokemon(Long id, Pokemon pokemon);

    public void deletePokemon(Long id);

    public Pokemon_Stats getStatsByPokemonId(Long pokemonId);
    
}
