package exercicios6;

public class Audio {
    private String titulo;
    private int duracao; // em segundos
    private int totalReproducoes;
    private int curtidas;
    private int classificacao; // de 1 a 5, por exemplo

    public void reproduzir() {
        totalReproducoes++;
        System.out.println("Reproduzindo: " + titulo);
    }

    public void curtir() {
        curtidas++;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
