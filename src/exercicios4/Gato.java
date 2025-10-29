package exercicios4;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }
}
