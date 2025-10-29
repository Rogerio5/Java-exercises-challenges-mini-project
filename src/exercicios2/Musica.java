package exercicios2;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliar(int nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calcularMedia() {
        if (numAvaliacoes == 0) {
            return 0;
        }
        return (double) avaliacao / numAvaliacoes;
    }
}

