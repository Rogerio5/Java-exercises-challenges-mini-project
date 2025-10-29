package exercicios;

public class PraticandoVariaveis {
    public static void main(String[] args) {

        // 1. Média de duas notas decimais
        double nota1 = 8.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // 2. Casting de double para int
        double valorDouble = 9.7;
        int valorInt = (int) valorDouble;
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor convertido para int: " + valorInt);

        // 3. Variável char e String concatenadas
        char letra = 'A';
        String palavra = "prendizado";
        System.out.println("Mensagem: " + letra + palavra);

        // 4. Cálculo do valor total de um produto
        double precoProduto = 19.90;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total da compra: R$ " + valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;
        System.out.println("US$ " + valorEmDolares + " equivalem a R$ " + String.format("%.2f", valorEmReais));

        // 6. Cálculo de desconto
        double precoOriginal = 200.0;
        double percentualDesconto = 10.0; // 10%
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}
