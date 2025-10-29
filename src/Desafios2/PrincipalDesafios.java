package Desafios2;



import Desafios2.modelos.Titulo;
import Desafios2.modelos.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalDesafios {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();

        // 1. Escrevendo em arquivo simples
        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write("Conteúdo a ser gravado no arquivo.");
            System.out.println("✅ Arquivo 'arquivo.txt' criado com sucesso!");
        } catch (IOException e) {
            System.out.println("❌ Erro ao escrever no arquivo: " + e.getMessage());
        }

        // 2. Serializando Titulo
        Titulo titulo = new Titulo("Matrix", 1999, "Wachowski");
        String jsonTituloPretty = gsonPretty.toJson(titulo);

        System.out.println("\n=== JSON formatado de Titulo ===");
        System.out.println(jsonTituloPretty);

        try (FileWriter writer = new FileWriter("titulo.json")) {
            writer.write(jsonTituloPretty);
            System.out.println("✅ Arquivo 'titulo.json' criado com sucesso!");
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar titulo.json: " + e.getMessage());
        }

        // 3. Serializando Veiculo
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2020);
        String jsonVeiculoPretty = gsonPretty.toJson(carro);

        System.out.println("\n=== JSON formatado de Veiculo ===");
        System.out.println(jsonVeiculoPretty);

        try (FileWriter writer = new FileWriter("veiculo.json")) {
            writer.write(jsonVeiculoPretty);
            System.out.println("✅ Arquivo 'veiculo.json' criado com sucesso!");
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar veiculo.json: " + e.getMessage());
        }

        // 4. Desserializando Titulo
        try (FileReader reader = new FileReader("titulo.json")) {
            Titulo tituloLido = gson.fromJson(reader, Titulo.class);
            System.out.println("\n📖 Objeto Titulo lido do arquivo:");
            System.out.println(tituloLido);
        } catch (IOException e) {
            System.out.println("❌ Erro ao ler titulo.json: " + e.getMessage());
        }

        // 5. Desserializando Veiculo
        try (FileReader reader = new FileReader("veiculo.json")) {
            Veiculo veiculoLido = gson.fromJson(reader, Veiculo.class);
            System.out.println("\n🚗 Objeto Veiculo lido do arquivo:");
            System.out.println(veiculoLido);
        } catch (IOException e) {
            System.out.println("❌ Erro ao ler veiculo.json: " + e.getMessage());
        }
    }
}


