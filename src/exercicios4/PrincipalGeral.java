package exercicios4;

public class PrincipalGeral {
    public static void main(String[] args) {
        System.out.println("=== Teste Carro ===");
        ModeloCarro carro = new ModeloCarro("Civic", 90000, 95000, 97000);
        carro.exibirInformacoes();

        System.out.println("\n=== Teste Animal ===");
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        a1.emitirSom();
        a2.emitirSom();
        ((Cachorro) a1).abanarRabo();
        ((Gato) a2).arranharMoveis();

        System.out.println("\n=== Teste Conta ===");
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        System.out.println("Saldo inicial: " + cc.consultarSaldo());
        cc.cobrarTarifaMensal();
        System.out.println("Saldo após tarifa: " + cc.consultarSaldo());

        System.out.println("\n=== Teste Números Primos ===");
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        verificador.verificarSeEhPrimo(18);

        GeradorPrimo gerador = new GeradorPrimo();
        System.out.println("Próximo primo: " + gerador.gerarProximoPrimo());
        System.out.println("Próximo primo: " + gerador.gerarProximoPrimo());
    }
}

