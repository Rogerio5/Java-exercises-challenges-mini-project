package exercicios4;

public class GeradorPrimo extends NumerosPrimos {
    private int ultimoPrimo = 1;

    public int gerarProximoPrimo() {
        int candidato = ultimoPrimo + 1;
        while (!verificarPrimalidade(candidato)) {
            candidato++;
        }
        ultimoPrimo = candidato;
        return candidato;
    }
}
