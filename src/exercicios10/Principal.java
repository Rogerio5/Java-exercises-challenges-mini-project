package exercicios10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro do produto " + (i + 1));
            System.out.print("É perecível (S/N)? ");
            String tipo = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            if (tipo.equalsIgnoreCase("S")) {
                System.out.print("Ano de validade: ");
                int ano = sc.nextInt();
                System.out.print("Mês de validade: ");
                int mes = sc.nextInt();
                System.out.print("Dia de validade: ");
                int dia = sc.nextInt();
                sc.nextLine();

                listaProdutos.add(new ProdutoPerecivel(nome, preco, quantidade, LocalDate.of(ano, mes, dia)));
            } else {
                listaProdutos.add(new Produto(nome, preco, quantidade));
            }
        }

        System.out.println("\n=== Lista de Produtos Cadastrados ===");
        for (Produto p : listaProdutos) {
            System.out.println(p);
        }

        sc.close();
    }
}

