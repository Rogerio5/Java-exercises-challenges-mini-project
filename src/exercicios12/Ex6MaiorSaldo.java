package exercicios12;


import java.util.ArrayList;

public class Ex6MaiorSaldo {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("001", 1500.0));
        contas.add(new ContaBancaria("002", 3200.0));
        contas.add(new ContaBancaria("003", 2800.0));

        ContaBancaria maior = contas.get(0);
        for (ContaBancaria c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }

        System.out.println("Conta com maior saldo: " + maior);
    }
}
