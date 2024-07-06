package modelos;

import exceptions.FilmNotFoundException;

public class Pelicula {
    private String titulo;
    private int numeroDeEpisodio;
    private String director;
    private int añoDeLanzamiento;


    public Pelicula(PeliculaRecord peliculaRecord) {
        if(peliculaRecord.detail() != null) {
            throw new FilmNotFoundException("El numero de pelicula no es valido, utiliza numeros entre 1 y 6");
        }
        titulo = peliculaRecord.title();
        numeroDeEpisodio = Integer.parseInt(peliculaRecord.episode_id());
        director = peliculaRecord.director();
        añoDeLanzamiento = Integer.parseInt(peliculaRecord.release_date().substring(0,4));
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeEpisodio=" + numeroDeEpisodio +
                ", director='" + director + '\'' +
                ", añoDeLanzamiento=" + añoDeLanzamiento +
                '}';
    }
}
