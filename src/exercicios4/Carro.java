package exercicios4;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double ano1, double ano2, double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }

    public double getMenorPreco() {
        return Math.min(precoAno1, Math.min(precoAno2, precoAno3));
    }

    public double getMaiorPreco() {
        return Math.max(precoAno1, Math.max(precoAno2, precoAno3));
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Menor preço: " + getMenorPreco());
        System.out.println("Maior preço: " + getMaiorPreco());
    }
}

