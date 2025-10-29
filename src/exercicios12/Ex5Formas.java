package exercicios12;


import java.util.ArrayList;

public class Ex5Formas {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3));
        formas.add(new Quadrado(4));

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}

