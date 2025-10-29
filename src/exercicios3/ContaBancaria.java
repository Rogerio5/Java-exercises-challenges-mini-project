package exercicios3;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular; // público, pode ser acessado diretamente

    // Getter e Setter para numeroConta
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Getter e Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

