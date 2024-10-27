package com.aluracurso.screenmatch.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosTemporadas(
        @JsonAlias("Season") Integer Season_numero,
        @JsonAlias("Episodes")List<DatosEpisodio> Num_episodios

) {
}
