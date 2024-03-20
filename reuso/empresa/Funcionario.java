package reuso.empresa;

public class Funcionario extends Pessoa {
    
    private String cargo;
    private int cargaHoraria;
    private double salario;

    public Funcionario(String nome, int id, int idade, String cargo, int cargaHoraria, double salario){
        super(nome, id, idade);
        this.cargo = cargo;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }


    public String getCargo(){
        return this.cargo;
    }


    public int getCargaHoraria(){
        return this.cargaHoraria;
    }


    public double getSalario(){
        return this.salario;
    }


    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Cargo: " + this.cargo + "\n" +
                "Carga horaria: " + this.cargaHoraria + "\n" +
                "Salario: " + this.salario + "\n";
    }
}