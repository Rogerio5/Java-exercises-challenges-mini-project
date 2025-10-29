package exercicios12;


public class Ex2Casting {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Animal a = (Animal) dog; // casting
        a.emitirSom();
    }
}
