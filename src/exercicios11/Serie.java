package exercicios11;

public class Serie extends Titulo {
    private int temporadas;

    public Serie(String nome, int temporadas) {
        super(nome);
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Série: " + getNome() + " | Temporadas: " + temporadas;
    }
}

