package exercicios15;

import java.util.*;

public class Ex3OrdenaTitulos {
    public static void executar() {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Matrix"));
        titulos.add(new Titulo("Avatar"));
        titulos.add(new Titulo("O Senhor dos Anéis"));
        titulos.add(new Titulo("Batman Begins"));

        System.out.println("Lista original: " + titulos);
        Collections.sort(titulos);
        System.out.println("Lista ordenada: " + titulos);
    }
}
