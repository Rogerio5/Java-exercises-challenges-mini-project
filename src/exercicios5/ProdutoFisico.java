package exercicios5;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private double taxa;

    public ProdutoFisico(double preco, double taxa) {
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxa;
    }
}

