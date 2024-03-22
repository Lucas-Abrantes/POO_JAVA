package questoes.questao_42;

public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double aumentaSalario(double aumento){
        return this.salario+= this.salario * (aumento/100);
    }

    public double getSalario(){
        return this.salario;
    }

    public double ganhoAnual(){
        double decimo = this.salario/12;
        return decimo * 9 + this.salario * 12;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Salario R$: " + this.salario;
    }
}
