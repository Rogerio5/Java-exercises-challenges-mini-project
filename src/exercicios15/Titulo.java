package exercicios15;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}

