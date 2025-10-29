package exercicios5;

public class Servico implements Vendavel {
    private double precoHora;
    private int horas;

    public Servico(double precoHora, int horas) {
        this.precoHora = precoHora;
        this.horas = horas;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * horas * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return (precoHora * horas) - ((precoHora * horas) * percentual / 100);
    }
}
