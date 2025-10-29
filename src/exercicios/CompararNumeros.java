package exercicios;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

        scanner.close();
    }
}

