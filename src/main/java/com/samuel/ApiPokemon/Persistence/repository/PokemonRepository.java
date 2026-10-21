package com.samuel.ApiPokemon.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.ApiPokemon.Persistence.model.Pokemon;
//Implemento JPA para conecntarme a la base de datos y hacer las operaciones CRUD
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    
}
