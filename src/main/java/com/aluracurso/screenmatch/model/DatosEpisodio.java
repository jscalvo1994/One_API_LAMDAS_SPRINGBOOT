package com.aluracurso.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(
        @JsonAlias("Title") String TituloEpisodio,
        @JsonAlias("Episode") Integer numeroEpisodioSerie,
        @JsonAlias("imdbRating") String evaluacionEpisodio,
        @JsonAlias("Released") String fechaDeLanzamiento

) {
}
