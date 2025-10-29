package exercicios12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU EXERCICIOS12 ===");
            System.out.println("1 - ArrayList de Strings");
            System.out.println("2 - Casting Animal/Cachorro");
            System.out.println("3 - Instanceof com Animal/Cachorro");
            System.out.println("4 - Média de Produtos");
            System.out.println("5 - Áreas de Formas (Círculo/Quadrado)");
            System.out.println("6 - Conta com maior saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> Ex1ArrayListStrings.main(null);
                case 2 -> Ex2Casting.main(null);
                case 3 -> Ex3Instanceof.main(null);
                case 4 -> Ex4MediaProdutos.main(null);
                case 5 -> Ex5Formas.main(null);
                case 6 -> Ex6MaiorSaldo.main(null);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

