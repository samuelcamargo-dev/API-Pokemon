package com.samuel.ApiPokemon.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samuel.ApiPokemon.Persistence.model.Pokemon;
import com.samuel.ApiPokemon.Persistence.repository.PokemonRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon getPokemonById(Long id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    @Override
    public Pokemon createPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Pokemon updatePokemon(Long id, Pokemon pokemon) {
        Pokemon existingPokemon = pokemonRepository.findById(id).orElse(null);
        
        existingPokemon.setPokemonNombre(pokemon.getPokemonNombre());
        existingPokemon.setImagenUrl(pokemon.getImagenUrl());
        existingPokemon.setPokemonTipo(pokemon.getPokemonTipo());
        return pokemonRepository.save(existingPokemon);
    }

    @Override
    public void deletePokemon(Long id) {
        Pokemon existingPokemon = pokemonRepository.findById(id).orElseThrow(() -> new RuntimeException("Pokemon not found with id: " + id));
        pokemonRepository.delete(existingPokemon);
    }

}
