package MiniProjeto;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(101);
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + tentativas + " tentativas.\n");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("🎉 Parabéns! Você acertou o número!");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR que " + palpite + ".");
            } else {
                System.out.println("O número secreto é MENOR que " + palpite + ".");
            }
        }

        if (!acertou) {
            System.out.println("\nSuas tentativas acabaram! O número era: " + numeroSecreto);
        }

        scanner.close();
    }
}

