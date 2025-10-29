package exercicios3;

public class Aluno {
    private String nome;
    private double[] notas;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Método de regra de negócio
    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

