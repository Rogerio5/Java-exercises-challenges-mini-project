package desafios;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("***************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Qual valor deseja transferir? ");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia <= 0) {
                        System.out.println("Valor inválido. Digite um valor positivo.");
                    } else if (valorTransferencia > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.printf("Transferência realizada. Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Qual valor deseja receber? ");
                    double valorRecebido = leitura.nextDouble();
                    if (valorRecebido <= 0) {
                        System.out.println("Valor inválido. Digite um valor positivo.");
                    } else {
                        saldo += valorRecebido;
                        System.out.printf("Valor recebido com sucesso. Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema... Obrigado por usar nosso banco!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        leitura.close();
    }
}
