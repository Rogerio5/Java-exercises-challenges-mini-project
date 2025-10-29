package exercicios11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();

        // Adicionando títulos de tipos diferentes
        lista.add(new Filme("O Senhor dos Anéis", "Peter Jackson"));
        lista.add(new Serie("Breaking Bad", 5));
        lista.add(new Filme("Matrix", "Lana e Lilly Wachowski"));

        // Percorrendo a lista com foreach
        for (Titulo t : lista) {
            System.out.println(t); // imprime usando toString()

            // Verificando se é um Filme antes de fazer o casting
            if (t instanceof Filme) {
                Filme f = (Filme) t; // casting seguro
                System.out.println("  -> Diretor: " + f.getDiretor());
            }
        }
    }
}

