package principal;

import apis.swapi.SWapi;
import exceptions.FilmNotFoundException;
import json.JsonTransformer;
import modelos.Pelicula;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SWapi swapi = new SWapi();

        System.out.println("Ingrese el numero de pelicula a buscar");
        try {
            String json = swapi.busqueda(scanner.nextInt());

            FileWriter fw = new FileWriter("pelicula.json");

            fw.write(JsonTransformer.peliculaToJson(JsonTransformer.jsonToPelicula(json)));

            fw.close();
        } catch (FilmNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Programa finalizado");
    }
}