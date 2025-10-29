package omdbAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o título do filme: ");
            String titulo = sc.nextLine();

            // 👉 Substitua pela sua chave real recebida por e-mail
            String apiKey = "fcafe5a5";
            String urlString = "http://www.omdbapi.com/?t=" + titulo.replace(" ", "+") + "&apikey=" + apiKey;

            URL url = new URL(urlString);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            int resposta = conexao.getResponseCode();
            if (resposta == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
                String inputLine;
                StringBuilder conteudo = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    conteudo.append(inputLine);
                }
                in.close();

                System.out.println("\n=== Resposta da API OMDb ===");
                System.out.println(conteudo.toString());
            } else {
                System.out.println("Erro na requisição. Código HTTP: " + resposta);
            }

            conexao.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

