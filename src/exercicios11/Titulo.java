package exercicios11;

public class Titulo {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Título: " + nome;
    }
}

