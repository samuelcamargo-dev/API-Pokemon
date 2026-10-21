package com.samuel.ApiPokemon.Persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table (name = "pokemons")
@Getter 
@Setter
@NoArgsConstructor 
public class Pokemon {

    @Id 
    @Column(name = "pokemon_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long pokemonId;

    @Column(name = "pokemon_nombre")
    private String pokemonNombre;

    @Column (name = "imagen_url")
    private String imagenUrl;

    @Column (name = "pokemon_tipo")
    private String pokemonTipo;

    // Getters y Setters explícitos
    /* 
    public Long getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Long pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getPokemonNombre() {
        return pokemonNombre;
    }

    public void setPokemonNombre(String pokemonNombre) {
        this.pokemonNombre = pokemonNombre;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getPokemonTipo() {
        return pokemonTipo;
    }

    public void setPokemonTipo(String pokemonTipo) {
        this.pokemonTipo = pokemonTipo;
    }
        */
}
