package exercicios14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("O Senhor dos Anéis", 2001));
        titulos.add(new Titulo("Matrix", 1999));
        titulos.add(new Titulo("Avatar", 2009));
        titulos.add(new Titulo("Batman Begins", 2005));

        System.out.println("=== Lista original ===");
        titulos.forEach(System.out::println);

        // Ordenação natural (Comparable → por nome)
        Collections.sort(titulos);

        System.out.println("\n=== Lista ordenada por nome (Comparable) ===");
        titulos.forEach(System.out::println);
    }
}

