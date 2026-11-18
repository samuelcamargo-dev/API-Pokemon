package com.samuel.ApiPokemon.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samuel.ApiPokemon.Persistence.model.Abilities;
import com.samuel.ApiPokemon.Persistence.repository.AbilitiesRepository;
import com.samuel.ApiPokemon.Service.AbilitiesService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class AbilitiesServiceImpl implements AbilitiesService {

    AbilitiesRepository abilityRepository;

    @Override
    public List<Abilities> getAllAbilities() {
        return abilityRepository.findAll();
    }
}