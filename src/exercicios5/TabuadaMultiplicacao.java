package exercicios5;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

