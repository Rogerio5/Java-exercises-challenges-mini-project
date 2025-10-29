package exercicios16;


import exercicios16.modelos.Livro;
import com.google.gson.Gson;

public class PrincipalLivro {
    public static void main(String[] args) {
        String json = """
                {
                  "titulo": "Java Essencial",
                  "autor": "Rogerio Sabino",
                  "editora": {
                      "nome": "TechBooks",
                      "cidade": "São Paulo"
                  }
                }
                """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);
    }
}

