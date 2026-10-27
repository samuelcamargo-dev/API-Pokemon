package com.samuel.ApiPokemon.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.ApiPokemon.Controller.converter.Converter;
import com.samuel.ApiPokemon.Controller.dto.PokemonDto;
import com.samuel.ApiPokemon.Persistence.model.Pokemon;
import com.samuel.ApiPokemon.Service.PokemonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping ("/api/v1/pokemons")
@CrossOrigin 
@AllArgsConstructor 
public class PokemonController {

    PokemonService pokemonService;

    Converter converter;

    @GetMapping 
    public ResponseEntity<List<PokemonDto>> getAllPokemons() {
        return ResponseEntity.ok(pokemonService.getAllPokemons().stream().map(converter::converterDto).collect(Collectors.toList()));
    }

    @GetMapping ("/{id}")
    public ResponseEntity<PokemonDto> getPokemonById(@PathVariable Long id) {
        Pokemon pokemon = pokemonService.getPokemonById(id);
        return ResponseEntity.status(HttpStatus.OK).body(converter.converterDto(pokemon));
    }

    @PostMapping 
    public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto) {
        Pokemon pokemon = converter.converterEntity(pokemonDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(converter.converterDto(pokemonService.createPokemon(pokemon)));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<PokemonDto> updatePokemon(@PathVariable Long id, @RequestBody PokemonDto pokemonDto) {
        Pokemon pokemon = converter.converterEntity(pokemonDto);
        return ResponseEntity.ok(converter.converterDto(pokemonService.updatePokemon(id, pokemon)));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
        return ResponseEntity.noContent().build();          
    }
}
