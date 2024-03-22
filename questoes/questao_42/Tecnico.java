package questoes.questao_42;

public class Tecnico extends Assistente {
    
    private String especialidade;

    public Tecnico(String nome, double salario, int matricula, String especialidade){
        super(nome, salario, matricula);
        this.especialidade = especialidade;
    }

    public double ganhoAnual(){
        return super.ganhoAnual();
    }

    public double bonusSalarial(double bonus){
        return super.getSalario() + (super.getSalario()*bonus/100);
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Especialidade: " + this.especialidade;
    }
}
