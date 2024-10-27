package com.aluracurso.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(
        @JsonAlias("Title")String titulo,
        @JsonAlias("Episode")Integer numeroEpisodio,
        @JsonAlias("imdRating")String evaluacion,
        @JsonAlias("Released")String fechaDeLanzamiento

) {
}
