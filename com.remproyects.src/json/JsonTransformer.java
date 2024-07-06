package json;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Pelicula;
import modelos.PeliculaRecord;

public class JsonTransformer {

    public static Pelicula jsonToPelicula(String json) {
        Gson gson = new Gson();
        PeliculaRecord peliculaRecord = gson.fromJson(json, PeliculaRecord.class);

        return new Pelicula(peliculaRecord);
    }

    public static String peliculaToJson(Pelicula pelicula) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        return gson.toJson(pelicula);
    }

}
