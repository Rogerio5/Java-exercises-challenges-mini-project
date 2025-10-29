package Desafios2;



import Desafios2.modelos.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalTituloPretty {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Interestelar", 2014, "Christopher Nolan");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(titulo);

        System.out.println("JSON formatado:");
        System.out.println(json);
    }
}

