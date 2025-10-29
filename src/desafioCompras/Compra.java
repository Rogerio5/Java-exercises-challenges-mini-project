package desafioCompras;


public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }

    @Override
    public int compareTo(Compra outra) {
        return Double.compare(this.valor, outra.valor);
    }

    @Override
    public String toString() {
        return descricao + " - R$" + valor;
    }
}

