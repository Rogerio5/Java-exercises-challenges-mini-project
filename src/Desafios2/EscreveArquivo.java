package Desafios2;


import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write("Conteúdo a ser gravado no arquivo.");
            System.out.println("✅ Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("❌ Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

