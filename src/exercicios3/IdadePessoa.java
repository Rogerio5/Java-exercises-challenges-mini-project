package exercicios3;

public class IdadePessoa {
    private String nome;
    private int idade;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método de regra de negócio
    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }
    }
}

