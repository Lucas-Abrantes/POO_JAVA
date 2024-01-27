package questoes.questao_24;

public class Questao_24 {
    
    private String id, descricao;
    private int quantidade;
    private float preco, calculaTotal;

    public Questao_24(String id, String descricao, int quantidade, float preco){
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.calculaTotal = 0;
    }


    public int verificaQuantidade(){
        if(this.quantidade <= 0){
            System.out.println("Nao existe nenhuma compra ---> 0");
        }
        return quantidade;
    }

    public float verificaPreco(){
        if(this.preco <= 0){
            System.out.println("Preco nao cadastrado ---> 0.0");
        }
        return preco;
    }

    public void calculaTotalCompras(){
        System.out.println("Total da compra: "+ this.quantidade * this.preco);
    }

    public String toString(){
        return "Id: " + id + "\n" +
                "Descricao: " + descricao + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Preco: " + preco + "\n";
    }
}
