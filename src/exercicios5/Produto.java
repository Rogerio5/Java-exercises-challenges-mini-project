package exercicios5;

public class Produto implements Vendavel {
    private double precoUnitario;

    public Produto(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return precoUnitario - (precoUnitario * percentual / 100);
    }
}

