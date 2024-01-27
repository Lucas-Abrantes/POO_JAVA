package exemplos.aluno;

public class DemoAluno {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Lucas", "45000", 8F, 8.3F, 7.3F);
        aluno1.obterNome();
        aluno1.obterMatricula();
        aluno1.obterNotaFinal();

        float notafinalF = aluno1.calculaNotaFinal();
        System.out.printf("Nota final: %.2f\n", notafinalF);
        System.out.println("");
        aluno1.informarNotas();
        System.out.println("");
    }
}
