package ProjetoAPI;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGeckoAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a criptomoeda (ex: bitcoin, ethereum, dogecoin): ");
            String cripto = sc.nextLine().toLowerCase();

            String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + cripto + "&vs_currencies=usd,brl";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n=== Cotação da Criptomoeda ===");
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
