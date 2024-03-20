package reuso.empresa;

public class Pessoa {
    private String nome;
    private int id, idade;

    public Pessoa(String nome, int id, int idade){
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "id: " + this.id + "\n" +
                "idade: " + this.idade + "\n";
    }
}
