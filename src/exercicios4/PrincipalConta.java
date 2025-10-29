package exercicios4;

public class PrincipalConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        System.out.println("Saldo inicial: " + cc.consultarSaldo());
        cc.cobrarTarifaMensal();
        System.out.println("Saldo após tarifa: " + cc.consultarSaldo());
    }
}

