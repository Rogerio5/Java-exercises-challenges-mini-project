package exercicios5;

public class Livro implements Calculavel {
    private double preco;
    private double desconto;

    public Livro(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto / 100);
    }
}
