package exercicios15;


public class Ex2TitulosComparable {
    public static void executar() {
        Titulo t1 = new Titulo("Matrix");
        Titulo t2 = new Titulo("Avatar");

        System.out.println("Comparando '" + t1 + "' com '" + t2 + "': " + t1.compareTo(t2));
    }
}
