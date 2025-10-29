package exercicios11;

public class Filme extends Titulo {
    private String diretor;

    public Filme(String nome, String diretor) {
        super(nome);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " | Diretor: " + diretor;
    }
}
