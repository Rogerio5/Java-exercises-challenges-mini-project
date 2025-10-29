package exercicios15;

import java.util.*;

public class Ex4ArrayListLinkedList {
    public static void executar() {
        List<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        System.out.println("ArrayList: " + lista1);

        List<String> lista2 = new LinkedList<>();
        lista2.add("X");
        lista2.add("Y");
        lista2.add("Z");
        System.out.println("LinkedList: " + lista2);
    }
}

