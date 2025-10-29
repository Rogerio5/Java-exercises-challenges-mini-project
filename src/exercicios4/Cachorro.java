package exercicios4;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}
