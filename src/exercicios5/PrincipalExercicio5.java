package exercicios5;

public class PrincipalExercicio5 {
    public static void main(String[] args) {
        // Conversor de Moeda
        ConversorMoeda cm = new ConversorMoeda();
        System.out.println("100 dólares em reais: " + cm.converterDolarParaReal(100));

        // Sala Retangular
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5, 3);
        System.out.println("Área da sala: " + sala.calcularArea());
        System.out.println("Perímetro da sala: " + sala.calcularPerimetro());

        // Tabuada
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);

        // Conversor de Temperatura
        ConversorTemperaturaPadrao temp = new ConversorTemperaturaPadrao();
        System.out.println("25°C em Fahrenheit: " + temp.celsiusParaFahrenheit(25));
        System.out.println("77°F em Celsius: " + temp.fahrenheitParaCelsius(77));

        // Calculável
        Livro livro = new Livro(50, 10);
        ProdutoFisico produto = new ProdutoFisico(100, 15);
        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());

        // Vendável
        Produto p = new Produto(20);
        Servico s = new Servico(50, 2);
        System.out.println("Preço total de 5 produtos: " + p.calcularPrecoTotal(5));
        System.out.println("Preço com desconto: " + p.aplicarDesconto(10));
        System.out.println("Preço total de 3 serviços: " + s.calcularPrecoTotal(3));
        System.out.println("Preço do serviço com desconto: " + s.aplicarDesconto(15));
    }
}
