package com.samuel.ApiPokemon.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.ApiPokemon.Persistence.model.Trainers;

public interface TrainersRepository extends JpaRepository<Trainers, Long> {

}
