package com.aluracurso.screenmatch;

import com.aluracurso.screenmatch.Service.ConsumoAPI;
import com.aluracurso.screenmatch.Service.ConvierteDatos;
import com.aluracurso.screenmatch.model.DatosEpisodio;
import com.aluracurso.screenmatch.model.DatosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

 	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 var consumoApi = new ConsumoAPI();
		 String url = "https://www.omdbapi.com/?t=game+of+thrones&apikey=c292a6ab";
		 var json = consumoApi.obtenerDatos(url);
		 System.out.println(json);
		 ConvierteDatos conversor = new ConvierteDatos();
		 var datos = conversor.obtenerDatos(json, DatosSerie.class);
		 System.out.println(datos);
		 String url2 ="https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=c292a6ab";
		 json= consumoApi.obtenerDatos(url2);

		 DatosEpisodio episodios = conversor.obtenerDatos(json, DatosEpisodio.class);
		 System.out.println(episodios);
	}
}
