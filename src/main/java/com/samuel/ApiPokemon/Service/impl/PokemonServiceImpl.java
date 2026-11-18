package com.samuel.ApiPokemon.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samuel.ApiPokemon.Persistence.model.Pokemon;
import com.samuel.ApiPokemon.Persistence.model.Pokemon_Stats;
import com.samuel.ApiPokemon.Persistence.repository.PokemonRepository;
import com.samuel.ApiPokemon.Persistence.repository.PokemonStatsRepository;
import com.samuel.ApiPokemon.Service.PokemonService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class PokemonServiceImpl implements PokemonService {

    PokemonRepository pokemonRepository;

    PokemonStatsRepository pokemonStatsRepository;

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
        Pokemon pokemonToUpdate = pokemonRepository.findById(id).orElse(null);
        if (pokemonToUpdate != null) {
            pokemonToUpdate.setName(pokemon.getName());
            pokemonToUpdate.setImagen_url(pokemon.getImagen_url());
            pokemonToUpdate.setPokemonTipo(pokemon.getPokemonTipo());
            return pokemonRepository.save(pokemonToUpdate);
        }
        return null;
    }

    @Override
    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

    @Override
    public Pokemon_Stats getStatsByPokemonId(Long pokemonId) {
        return pokemonStatsRepository.findByPokemonId(pokemonId);
    }
}