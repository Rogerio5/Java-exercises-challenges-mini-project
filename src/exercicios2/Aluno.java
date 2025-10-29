package exercicios2;

public class Aluno extends Pessoa {
    String matricula;

    void exibirInformacoesAluno() {
        // Reaproveita o método da classe Pessoa
        exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
    }
}


