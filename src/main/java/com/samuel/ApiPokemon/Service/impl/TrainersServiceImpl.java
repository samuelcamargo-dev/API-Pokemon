package com.samuel.ApiPokemon.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samuel.ApiPokemon.Persistence.model.Trainers;
import com.samuel.ApiPokemon.Persistence.repository.TrainersRepository;
import com.samuel.ApiPokemon.Service.TrainersService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class TrainersServiceImpl implements TrainersService {

    TrainersRepository trainersRepository;

    @Override
    public List<Trainers> getAllTrainers() {
        return trainersRepository.findAll();
    }
}
