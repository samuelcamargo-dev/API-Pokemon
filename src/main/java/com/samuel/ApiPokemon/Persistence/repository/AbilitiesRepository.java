package com.samuel.ApiPokemon.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.ApiPokemon.Persistence.model.Abilities;

public interface AbilitiesRepository extends JpaRepository<Abilities, Long> {

}
