package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o título do filme: ");
            String titulo = sc.nextLine().replace(" ", "+");

            // 🔑 Sua chave da OMDb
            String apiKey = "fcafe5a5";

            // Busca por título
            String url = "http://www.omdbapi.com/?t=" + titulo + "&apikey=" + apiKey;

            // Se quiser fixar por ID, use:
            // String url = "http://www.omdbapi.com/?i=tt3896198&apikey=" + apiKey;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("\n=== JSON recebido ===");
            System.out.println(json);

            // ⚠️ Verifica se a API retornou erro
            if (json.contains("\"Response\":\"False\"")) {
                System.out.println("❌ Filme não encontrado ou chave inválida!");
                return;
            }

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println("\n=== Record TituloOmdb ===");
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("\n=== Titulo já convertido ===");
            meuTitulo.exibeFichaTecnica();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
