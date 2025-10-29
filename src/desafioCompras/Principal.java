package desafioCompras;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();
        double limite = 2000.0;
        double saldoDisponivel = limite;
        int opcao;

        do {
            System.out.println("\n=== MENU CARTÃO DE CRÉDITO ===");
            System.out.println("Limite total: R$" + limite + " | Saldo disponível: R$" + saldoDisponivel);
            System.out.println("1 - Lançar nova compra");
            System.out.println("2 - Exibir lista de compras (ordenadas por valor)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Descrição da compra: ");
                    String desc = sc.nextLine();
                    System.out.print("Valor da compra: ");
                    double valor = sc.nextDouble();

                    if (valor <= saldoDisponivel) {
                        compras.add(new Compra(desc, valor));
                        saldoDisponivel -= valor;
                        System.out.println("Compra registrada com sucesso!");
                    } else {
                        System.out.println("⚠️ Saldo insuficiente! Compra não realizada.");
                    }
                }
                case 2 -> {
                    if (compras.isEmpty()) {
                        System.out.println("Nenhuma compra registrada.");
                    } else {
                        Collections.sort(compras);
                        System.out.println("\n=== LISTA DE COMPRAS ORDENADAS POR VALOR ===");
                        compras.forEach(System.out::println);
                        System.out.println("Saldo disponível: R$" + saldoDisponivel);
                    }
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

