package com.samuel.ApiPokemon.Controller.converter;

import org.springframework.stereotype.Component;

import com.samuel.ApiPokemon.Controller.dto.AbilityDto;
import com.samuel.ApiPokemon.Controller.dto.PokemonDto;
import com.samuel.ApiPokemon.Controller.dto.PokemonStatsDto;
import com.samuel.ApiPokemon.Controller.dto.TrainerDto;
import com.samuel.ApiPokemon.Persistence.model.Abilities;
import com.samuel.ApiPokemon.Persistence.model.Pokemon;
import com.samuel.ApiPokemon.Persistence.model.Pokemon_Stats;
import com.samuel.ApiPokemon.Persistence.model.Trainers;

@Component 
public class Converter {

    public TrainerDto converterDto(Trainers trainer) {
        TrainerDto trainerDto = new TrainerDto();

        trainerDto.setId(trainer.getId());
        trainerDto.setName(trainer.getName());
        trainerDto.setHometown(trainer.getHometown());

        return trainerDto;
    }

    public PokemonDto converterDto(Pokemon pokemon) {
        PokemonDto pokemonDto = new PokemonDto();
        
        pokemonDto.setId(pokemon.getId());
        pokemonDto.setName(pokemon.getName());
        pokemonDto.setImagen_url(pokemon.getImagen_url());
        pokemonDto.setPokemonTipo(pokemon.getPokemonTipo());
        if (pokemon.getTrainer() != null) {
            pokemonDto.setTrainerId(pokemon.getTrainer().getId());
        }

        return pokemonDto;
    }

    public Pokemon converterEntity(PokemonDto pokemonDto) {
        Pokemon pokemon = new Pokemon();
        
        pokemon.setId(pokemonDto.getId());
        pokemon.setName(pokemonDto.getName());
        pokemon.setImagen_url(pokemonDto.getImagen_url());
        pokemon.setPokemonTipo(pokemonDto.getPokemonTipo());

        return pokemon;
    }

    public PokemonStatsDto converterDto(Pokemon_Stats stats) {
        PokemonStatsDto statsDto = new PokemonStatsDto();

        statsDto.setId(stats.getId());
        statsDto.setHp(stats.getHp());
        statsDto.setAttack(stats.getAttack());
        statsDto.setDefense(stats.getDefense());
        statsDto.setSpeed(stats.getSpeed());
        statsDto.setHeight(stats.getHeight());
        statsDto.setWeight(stats.getWeight());
        if (stats.getPokemon() != null) {
            statsDto.setPokemonId(stats.getPokemon().getId());
        }

        return statsDto;
    }

    public AbilityDto converterDto(Abilities ability) {
        AbilityDto abilityDto = new AbilityDto();

        abilityDto.setId(ability.getId());
        abilityDto.setName(ability.getName());
        abilityDto.setDescription(ability.getDescription());

        return abilityDto;
    }
}