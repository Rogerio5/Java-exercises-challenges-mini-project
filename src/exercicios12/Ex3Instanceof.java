package exercicios12;


public class Ex3Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro c = (Cachorro) animal;
            c.emitirSom();
        } else {
            System.out.println("Não é um cachorro!");
        }
    }
}
