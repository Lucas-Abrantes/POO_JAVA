package questoes.questao_25;

public class DemoQuestao_25 {
    public static void main(String[] args) {
        Questao_25 aluno1 = new Questao_25("Lucas", "2023011212", 8F, 9F, 4.5F);

        aluno1.nomeAluno();
        System.out.println("");
        aluno1.exibeMatricula();
        aluno1.exibeNotas();
        System.out.println("");

        aluno1.mediaAluno();
        System.out.println("");

        String aluno_1 = aluno1.toString();
        System.out.println("Imprimindo dados: ");
        System.out.println(aluno_1);

    }
}
