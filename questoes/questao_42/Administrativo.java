package questoes.questao_42;

public class Administrativo extends Assistente {
    
    public Administrativo(String nome, double salario, int matricula){
        super(nome, salario, matricula);
    }

    public double adicionalNoturno(double adicional){
        return super.getSalario() + (super.getSalario()*adicional/100);
    }

    @Override
    public String toString(){
        return super.toString() + "\n";
    }

}
