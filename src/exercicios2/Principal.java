package exercicios2;

public class Principal {
    public static void main(String[] args) {
        // Testando Pessoa
        System.out.println("=== Teste Pessoa ===");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Maria";
        pessoa.idade = 28;
        pessoa.saudacao();
        pessoa.exibirInformacoes();

        // Testando Calculadora
        System.out.println("\n=== Teste Calculadora ===");
        Calculadora calc = new Calculadora();
        int numero = 5;
        System.out.println("Dobro de " + numero + " = " + calc.dobrar(numero));

        // Testando Musica
        System.out.println("\n=== Teste Musica ===");
        Musica musica = new Musica();
        musica.titulo = "Imagine";
        musica.artista = "John Lennon";
        musica.anoLancamento = 1971;
        musica.exibeFichaTecnica();
        musica.avaliar(10);
        musica.avaliar(9);
        musica.avaliar(8);
        System.out.println("Média de avaliações: " + musica.calcularMedia());

        // Testando Carro
        System.out.println("\n=== Teste Carro ===");
        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro.ano = 2018;
        carro.cor = "Preto";
        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.calcularIdade(2025) + " anos");

        // Testando Aluno
        System.out.println("\n=== Teste Aluno ===");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Rogerio";
        aluno1.idade = 31;
        aluno1.exibirInformacoes();
    }
}



