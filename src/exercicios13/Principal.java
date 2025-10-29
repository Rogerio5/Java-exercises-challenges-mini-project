package exercicios13;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Arroz", 25.0));
        lista.add(new Produto("Feijão", 10.0));
        lista.add(new Produto("Macarrão", 8.0));
        lista.add(new Produto("Café", 15.0));

        System.out.println("=== Lista original ===");
        lista.forEach(System.out::println);

        // Ordenação natural (Comparable → por preço)
        Collections.sort(lista);
        System.out.println("\n=== Ordenada por preço (Comparable) ===");
        lista.forEach(System.out::println);

        // Ordenação alternativa (Comparator → por nome)
        lista.sort(Comparator.comparing(Produto::getNome));
        System.out.println("\n=== Ordenada por nome (Comparator) ===");
        lista.forEach(System.out::println);

        // Outra ordenação alternativa (Comparator → preço decrescente)
        lista.sort(Comparator.comparing(Produto::getPreco).reversed());
        System.out.println("\n=== Ordenada por preço decrescente (Comparator) ===");
        lista.forEach(System.out::println);
    }
}

