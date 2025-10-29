package ProjetoAPI;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDBAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome da receita (ex: Arrabiata, Chicken): ");
            String receita = sc.nextLine().replace(" ", "_");

            String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n=== Receita encontrada ===");
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
