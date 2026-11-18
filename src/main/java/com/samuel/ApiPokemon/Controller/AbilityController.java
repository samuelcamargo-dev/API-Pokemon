package com.samuel.ApiPokemon.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.ApiPokemon.Controller.converter.Converter;
import com.samuel.ApiPokemon.Controller.dto.AbilityDto;
import com.samuel.ApiPokemon.Service.AbilitiesService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping ("/api/v1/abilities")
@CrossOrigin 
@AllArgsConstructor 
public class AbilityController {

    AbilitiesService abilityService;

    Converter converter;

    @GetMapping 
    public ResponseEntity<List<AbilityDto>> getAllAbilities() {
        return ResponseEntity.ok(abilityService.getAllAbilities().stream().map(converter::converterDto).collect(Collectors.toList()));
    }
}
