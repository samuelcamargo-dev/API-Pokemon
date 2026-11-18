package com.samuel.ApiPokemon.Service.impl;

import java.util.List;

import com.samuel.ApiPokemon.Persistence.model.Trainers;
import com.samuel.ApiPokemon.Persistence.repository.TrainersRepository;
import com.samuel.ApiPokemon.Service.TrainersService;

public class TrainerServiceImpl implements TrainersService {


        TrainersRepository trainerRepository;

    @Override
    public List<Trainers> getAllTrainers() {
        return trainerRepository.findAll();
    }
}


