package exercicios8;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            listaDePessoas.add(new Pessoa(nome, idade));
        }

        // Imprimindo o tamanho da lista
        System.out.println("\nTamanho da lista: " + listaDePessoas.size());

        // Imprimindo a primeira pessoa da lista (se existir)
        if (!listaDePessoas.isEmpty()) {
            System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        }

        // Imprimindo a lista completa
        System.out.println("\nLista completa de pessoas:");
        for (Pessoa p : listaDePessoas) {
            System.out.println(p);
        }

        sc.close();
    }
}


