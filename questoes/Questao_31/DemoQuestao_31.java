package questoes.Questao_31;

public class DemoQuestao_31 {
    public static void main(String[] args) {
        Questao_31 aluno = new Questao_31("1202");
        aluno.inicializaRegistroAcademico("Fisica", 12, 0.3);

        System.err.println(aluno.getNome());
        aluno.numeroMatriculados();
        System.out.println(aluno.getMatricula());
    }
}
