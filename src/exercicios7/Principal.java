package exercicios7;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("O Senhor dos Anéis", "Peter Jackson", 2001, 9.5));
        filmes.add(new Filme("Matrix", "Lana e Lilly Wachowski", 1999, 9.0));
        filmes.add(new Filme("Interestelar", "Christopher Nolan", 2014, 9.2));

        System.out.println("=== Minha Lista de Filmes ===");
        for (Filme f : filmes) {
            System.out.println(f); // chama automaticamente o toString()
        }
    }
}

