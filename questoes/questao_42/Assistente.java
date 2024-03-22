package questoes.questao_42;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public double ganhoAnual(){
        return super.ganhoAnual();
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Matricula: " + this.matricula;
    }
}
