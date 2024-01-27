package questoes.questao_23;


public class Questao_23 {

    private String nome;
    private int golsMarcados,golsSforidos, vitorias, empates, derrotas;

    public Questao_23(String nome, int golsMarcados, int golsSforidos, 
    int vitorias, int empates, int derrotas){
        this.nome = nome;
        this.golsMarcados = golsMarcados;
        this.golsSforidos = golsSforidos;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public void exibirNome(){
        System.err.println("Nome do time: " + this.nome);
    }

    public void quantVitorias(){
        System.out.println("Quantidade de vitorias: "+ this.vitorias);
    }

    public void quantDerrotas(){
        System.out.println("Quantidade de vitorias: "+ this.derrotas);
    }
    
    public String toString() {
        return "Time: " + nome + "\n" +
               "Vitórias: " + vitorias + "\n" +
               "Empates: " + empates + "\n" +
               "Derrotas: " + derrotas + "\n" +
               "Gols Marcados: " + golsMarcados + "\n" +
               "Gols Sofridos: " + golsSforidos + "\n";
    }
}