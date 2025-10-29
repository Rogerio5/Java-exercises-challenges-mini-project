package exercicios16.modelos;


public class Livro {
    private String titulo;
    private String autor;
    private Editora editora;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{titulo='" + titulo + "', autor='" + autor + "', editora=" + editora + "}";
    }
}

