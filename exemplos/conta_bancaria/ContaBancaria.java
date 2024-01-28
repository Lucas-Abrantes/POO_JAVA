package exemplos.conta_bancaria;

public class ContaBancaria {
    
    private String nome;
    private double saldo;
    private boolean especial;

    public ContaBancaria(String nome, double saldo, boolean especial){
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0.0;
        this.especial = false;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Saldo: "+ this.saldo);
        System.out.println("Especial: "+ this.especial);
    }


    public String getNome(){
        return "Nome: " + this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getEspecial(){
        return this.especial;
    }

    public void setEspecial(boolean especial){
        this.especial = especial;
    }

}
