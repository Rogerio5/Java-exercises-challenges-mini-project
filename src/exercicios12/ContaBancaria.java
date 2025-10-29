package exercicios12;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta + " | Saldo: R$" + saldo;
    }
}
