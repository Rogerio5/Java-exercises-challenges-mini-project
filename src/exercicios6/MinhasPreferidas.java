package exercicios6;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 4) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção para ouvir depois.");
        }
    }
}
