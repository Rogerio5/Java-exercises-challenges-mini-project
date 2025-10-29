package exercicios15;

import java.util.*;

public class Ex1OrdenaNumeros {
    public static void executar() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(7);
        numeros.add(19);
        numeros.add(3);

        System.out.println("Lista original: " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}

