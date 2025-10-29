package ProjetoAPI;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooksAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o título do livro: ");
            String titulo = sc.nextLine().replace(" ", "+");

            String url = "https://www.googleapis.com/books/v1/volumes?q=" + titulo;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n=== Resposta da API Google Books ===");
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

