package Desafios2;


import Desafios2.modelos.Titulo;
import com.google.gson.Gson;

public class PrincipalTitulo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Matrix", 1999, "Wachowski");

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        System.out.println("JSON gerado:");
        System.out.println(json);
    }
}
