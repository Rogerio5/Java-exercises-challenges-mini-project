import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme (nota de 0 a 10): ");
        double avaliacao = leitura.nextDouble();

        // Exibindo os dados coletados
        System.out.println("\n--- Informações do Filme ---");
        System.out.println("Filme: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);

        leitura.close();
    }
}
