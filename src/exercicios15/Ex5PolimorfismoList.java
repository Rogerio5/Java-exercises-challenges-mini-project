package exercicios15;

import java.util.*;

public class Ex5PolimorfismoList {
    public static void executar() {
        List<String> lista;

        lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        System.out.println("Usando ArrayList: " + lista);

        lista = new LinkedList<>();
        lista.add("C#");
        lista.add("Go");
        System.out.println("Usando LinkedList: " + lista);
    }
}

