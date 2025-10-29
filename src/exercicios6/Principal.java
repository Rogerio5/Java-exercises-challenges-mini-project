package exercicios6;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Bohemian Rhapsody");
        musica.setArtista("Queen");
        musica.setAlbum("A Night at the Opera");
        musica.setGenero("Rock");
        musica.setClassificacao(5);

        Podcast podcast = new Podcast();
        podcast.setTitulo("DevCast");
        podcast.setApresentador("Rogerio");
        podcast.setDescricao("Podcast sobre programação e tecnologia");
        podcast.setClassificacao(3);

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}

