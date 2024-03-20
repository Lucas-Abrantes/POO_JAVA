package reuso.empresa;

public class ChefeDepartamento extends Funcionario{
    
    private String funcao;
    private String nomeDepartamento;

    public ChefeDepartamento(String nome, int id, int idade, String cargo, int cargaHoraria,
    double salario, String funcao, String nomeDepartamento){
     super(nome, id, idade, cargo, cargaHoraria, salario);
     this.funcao = funcao;
     this.nomeDepartamento = nomeDepartamento;   
    }

    public String toString(){
        return super.toString() + "\n" +
                "Função: " + this.funcao + "\n" +
                "Nome do departamento: " + this.nomeDepartamento;
    }
}
