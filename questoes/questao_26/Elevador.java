package questoes.questao_26;

public class Elevador {
    private int capacidade, numAandar, andarAtual, quantidadePessoas;

    public Elevador(int capacidade, int numAandar){
        this.capacidade = capacidade;
        this.numAandar = numAandar;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entra(){
        if(this.quantidadePessoas < this.capacidade){
            quantidadePessoas++;
        }else{
            System.out.println("Quantidade maxima atingida");
        }
    }

    public void sai(){
        if(this.quantidadePessoas != 0){
            quantidadePessoas--;
        }
        else{
            System.out.println("Nao e possivel remover mais ninguem");
        }
    }

    public void sobe(){
        if(this.andarAtual < this.numAandar){
            this.andarAtual++;
        }
        else{
            System.err.println("Elevador encontra-se no ultimo andar");
        }
    }

    public void desce(){
        if(this.andarAtual > 0){
            this.andarAtual--;
        }
        else{
            System.out.println("Elevador encontra-se no terreo");
        }
    }

    public void exibeQuantidade(){
        System.out.println("Quantidade de pessoas: "+ this.quantidadePessoas);
    }

    public void exibeAndar(){
        System.out.println("Andar atual: " + this.andarAtual);
    }



}
