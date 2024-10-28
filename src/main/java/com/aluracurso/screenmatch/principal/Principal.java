package com.aluracurso.screenmatch.principal;
import com.aluracurso.screenmatch.Service.ConsumoAPI;
import com.aluracurso.screenmatch.Service.ConvierteDatos;
import com.aluracurso.screenmatch.model.DatosSerie;
import com.aluracurso.screenmatch.model.DatosTemporadas;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE ="https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=c292a6ab";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestra_menu (){
        System.out.println("Nombre de la serie que estas buscando");
        //buscar datos generales de la serie
        var nombre_serie = teclado.nextLine();

        String url = URL_BASE+nombre_serie.replace(" ", "+")+API_KEY;
        var json = consumoApi.obtenerDatos(url);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);
        // Buscar datos de las temporadas

        List<DatosTemporadas> temporadas =new ArrayList<>();

        for (int i = 1; i <= datos.totalDeTemporada() ; i++) {
            String url3 = URL_BASE + nombre_serie.replace(" ", "+")+"&Season="+i+API_KEY;
            json = consumoApi.obtenerDatos(url3);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
        temporadas.forEach(System.out::println);
        //Mostrar solo el titulo de los episodios para las temporadas

    }
}
