package exercicios9;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor { nome='" + getNome() + "', idade=" + getIdade() +
                ", disciplina='" + disciplina + "' }";
    }
}

