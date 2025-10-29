package exercicios4;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 15.0;

    public void cobrarTarifaMensal() {
        sacar(tarifaMensal);
        System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada.");
    }
}
