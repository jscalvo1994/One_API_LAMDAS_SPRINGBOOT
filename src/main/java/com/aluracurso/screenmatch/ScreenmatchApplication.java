package com.aluracurso.screenmatch;

import com.aluracurso.screenmatch.Service.ConsumoAPI;
import com.aluracurso.screenmatch.Service.ConvierteDatos;
import com.aluracurso.screenmatch.model.DatosEpisodio;
import com.aluracurso.screenmatch.model.DatosSerie;
import com.aluracurso.screenmatch.model.DatosTemporadas;
import com.aluracurso.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

 	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestra_menu();

	}
}
