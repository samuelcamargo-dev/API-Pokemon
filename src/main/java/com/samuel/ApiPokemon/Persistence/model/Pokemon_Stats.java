package com.samuel.ApiPokemon.Persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table (name = "pokemon_stats")
@NoArgsConstructor 
@Data 
public class Pokemon_Stats {

    @Id 
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hp")
    private int hp;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defense")
    private int defense;

    @Column(name = "speed")
    private int speed;

    @Column(name = "height")
    private double height;

    @Column(name = "weight")
    private double weight;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "pokemon_id", referencedColumnName = "id")
    private Pokemon pokemon;
    
}
