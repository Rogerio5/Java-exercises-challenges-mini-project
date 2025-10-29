package exercicios16.modelos;


public class Editora {
    private String nome;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Editora{nome='" + nome + "', cidade='" + cidade + "'}";
    }
}

