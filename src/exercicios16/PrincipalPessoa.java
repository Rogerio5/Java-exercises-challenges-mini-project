package exercicios16;


import exercicios16.modelos.Pessoa;
import com.google.gson.Gson;

public class PrincipalPessoa {
    public static void main(String[] args) {
        String json = """
                {"nome":"Rogerio","idade":35,"cidade":"Bauru"}
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);
    }
}

