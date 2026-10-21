-- Aquí el script para crear la tabla de Pokémon
create table pokemons(
	pokemon_id bigint auto_increment primary key,
	pokemon_nombre varchar(255),
	imagen_url varchar(255),
	pokemon_tipo varchar(255)
);