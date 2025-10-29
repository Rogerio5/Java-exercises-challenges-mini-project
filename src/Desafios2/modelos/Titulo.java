package Desafios2.modelos;

public class Titulo {
    private String nome;
    private int ano;
    private String diretor;

    public Titulo(String nome, int ano, String diretor) {
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
    }

    public String getNome() { return nome; }
    public int getAno() { return ano; }
    public String getDiretor() { return diretor; }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", diretor='" + diretor + '\'' +
                '}';
    }
}


