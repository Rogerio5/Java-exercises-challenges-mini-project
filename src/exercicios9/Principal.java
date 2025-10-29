package exercicios9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();

        System.out.println("=== Cadastro de Pessoas ===");
        System.out.print("Quantas pessoas deseja cadastrar? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1));
            System.out.print("É um Aluno (A) ou Professor (P)? ");
            String tipo = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (tipo.equalsIgnoreCase("A")) {
                System.out.print("Matrícula: ");
                int matricula = sc.nextInt();
                sc.nextLine();
                System.out.print("Curso: ");
                String curso = sc.nextLine();
                lista.add(new Aluno(nome, idade, matricula, curso));
            } else {
                System.out.print("Disciplina: ");
                String disciplina = sc.nextLine();
                lista.add(new Professor(nome, idade, disciplina));
            }
        }

        System.out.println("\n=== Lista de Pessoas Cadastradas ===");
        for (Pessoa p : lista) {
            System.out.println(p);
        }

        sc.close();
    }
}


