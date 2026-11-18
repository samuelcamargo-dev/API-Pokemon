package com.samuel.ApiPokemon.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.ApiPokemon.Controller.converter.Converter;
import com.samuel.ApiPokemon.Controller.dto.TrainerDto;
import com.samuel.ApiPokemon.Service.TrainersService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping ("/api/v1/trainers")
@CrossOrigin 
@AllArgsConstructor 
public class TrainerController {

    TrainersService trainersService;

    Converter converter;

    @GetMapping 
    public ResponseEntity<List<TrainerDto>> getAllTrainers() {
        return ResponseEntity.ok(trainersService.getAllTrainers().stream().map(converter::converterDto).collect(Collectors.toList()));
    }
}