package exercicios4;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom();
        a2.emitirSom();

        ((Cachorro) a1).abanarRabo();
        ((Gato) a2).arranharMoveis();
    }
}

