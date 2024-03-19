package questoes.questao_35;

public class Questao_35 {
    private int id, idade;
    private String nome, telefone;

    public Questao_35(int id, int idade, String nome, String telefone){
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Dados do cliente:" + "\n" +
                "id: "+ this.id + "\n" +
                "nome: " + this.nome + "\n" +
                "telefone: " + this.telefone;
    }
}
