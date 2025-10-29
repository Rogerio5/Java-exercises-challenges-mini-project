package exercicios3;

public class Principal {
    public static void main(String[] args) {
        // ContaBancaria
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(123);
        conta.setSaldo(500.0);
        conta.titular = "Rogerio";
        System.out.println("Conta: " + conta.getNumeroConta() + " - Titular: " + conta.titular + " - Saldo: " + conta.getSaldo());

        // IdadePessoa
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(20);
        pessoa.verificarIdade();

        // Produto
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3000.0);
        produto.aplicarDesconto(10);
        System.out.println("Produto: " + produto.getNome() + " - Preço com desconto: " + produto.getPreco());

        // Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setNotas(new double[]{8.0, 7.5, 9.0});
        System.out.println("Aluno: " + aluno.getNome() + " - Média: " + aluno.calcularMedia());

        // Livro
        Livro livro = new Livro();
        livro.setTitulo("Clean Code");
        livro.setAutor("Robert C. Martin");
        livro.exibirDetalhes();
    }
}
