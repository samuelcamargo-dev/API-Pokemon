package com.samuel.ApiPokemon.Service.impl;

import java.util.List;

import com.samuel.ApiPokemon.Persistence.model.Abilities;
import com.samuel.ApiPokemon.Persistence.repository.AbilitiesRepository;
import com.samuel.ApiPokemon.Service.AbilitiesService;

public class AbilityServiceImpl implements AbilitiesService {

    AbilitiesRepository abilitiesRepository;

    @Override
    public List<Abilities> getAllAbilities() {
        return abilitiesRepository.findAll();
    }

}
