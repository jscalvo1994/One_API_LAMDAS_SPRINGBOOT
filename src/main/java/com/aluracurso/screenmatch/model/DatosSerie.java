package com.aluracurso.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        @JsonAlias("Title") String Titulo,
        @JsonAlias("totalSeasons") Integer totalDeTemporada,
        @JsonAlias("imdbRating") String Evaluacion


) {
}
