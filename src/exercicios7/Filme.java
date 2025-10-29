package exercicios7;

public class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private double nota;

    public Filme(String titulo, String diretor, int anoLancamento, double nota) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "🎬 Filme: " + titulo +
                " | Diretor: " + diretor +
                " | Ano: " + anoLancamento +
                " | Nota: " + nota;
    }
}

