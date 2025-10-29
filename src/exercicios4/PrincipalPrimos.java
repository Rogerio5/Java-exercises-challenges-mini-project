package exercicios4;

public class PrincipalPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        verificador.verificarSeEhPrimo(18);

        GeradorPrimo gerador = new GeradorPrimo();
        System.out.println("Próximo primo: " + gerador.gerarProximoPrimo());
        System.out.println("Próximo primo: " + gerador.gerarProximoPrimo());
    }
}

