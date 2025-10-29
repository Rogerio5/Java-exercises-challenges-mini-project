package exercicios5;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA = 5.5;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA;
    }
}

