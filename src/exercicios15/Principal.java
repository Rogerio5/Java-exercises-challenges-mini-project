package exercicios15;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU EXERCICIOS15 ===");
            System.out.println("1 - Ordenar números inteiros");
            System.out.println("2 - Testar Comparable em Titulo");
            System.out.println("3 - Ordenar lista de Titulos");
            System.out.println("4 - ArrayList vs LinkedList");
            System.out.println("5 - Polimorfismo com List");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> Ex1OrdenaNumeros.executar();
                case 2 -> Ex2TitulosComparable.executar();
                case 3 -> Ex3OrdenaTitulos.executar();
                case 4 -> Ex4ArrayListLinkedList.executar();
                case 5 -> Ex5PolimorfismoList.executar();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

