package exercicios16;



import exercicios16.modelos.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalPessoaFlexivel {
    public static void main(String[] args) {
        String json = """
                {"nome":"Maria","idade":28,"pais":"Brasil"}
                """;

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);
    }
}

