package com.samuel.ApiPokemon.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.ApiPokemon.Persistence.model.Pokemon_Stats;

public interface PokemonStatsRepository extends JpaRepository<Pokemon_Stats, Long> {
    Pokemon_Stats findByPokemonId(Long pokemonId);
}