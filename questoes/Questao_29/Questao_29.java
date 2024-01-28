package questoes.Questao_29;

public class Questao_29 {
    private double real, imaginario;

    public Questao_29(Double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Questao_29(Double real){
        this.real = real;
        this.imaginario = 0;
    }

    public Questao_29(){
        this.real = 0;
        this.imaginario = 0;
    }

    public void complexo1(){
        System.out.println(this.real + " + " + this.imaginario + "i");
    }

}
