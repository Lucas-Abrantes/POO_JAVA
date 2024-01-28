package exemplos.pessoa;

public class Pessoa {
    
    private  String nome;
    private double altura;

    public Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return "Nome: " + this.nome;
    }

    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Altura: " + this.altura;
    }
}
