package exercicios14;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoLancamento;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() { return nome; }
    public int getAnoLancamento() { return anoLancamento; }

    // Implementação do Comparable → ordenação natural por nome
    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " (" + anoLancamento + ")";
    }
}
