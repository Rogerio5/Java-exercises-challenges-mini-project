package exercicios12;


import java.util.ArrayList;

public class Ex4MediaProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 25.0));
        produtos.add(new Produto("Feijão", 10.0));
        produtos.add(new Produto("Macarrão", 8.0));

        double soma = 0;
        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        double media = soma / produtos.size();

        System.out.println("Preço médio: R$" + media);
    }
}

