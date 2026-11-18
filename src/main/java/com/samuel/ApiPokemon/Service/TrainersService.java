package com.samuel.ApiPokemon.Service;

import java.util.List;

import com.samuel.ApiPokemon.Persistence.model.Pokemon;
import com.samuel.ApiPokemon.Persistence.model.Trainers;

public interface TrainersService {

    List<Trainers> getAllTrainers();

}
