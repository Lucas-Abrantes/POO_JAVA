package exemplos.atendimento;

public class Atendimento {
    public static int pessoasAtendidas;
    private String nome;
    private int numCaixa;

    public Atendimento(String nome, int numCaixa){
        this.nome = nome;
        this.numCaixa = numCaixa;
    }

    public void iniciaAtendimento(){
        pessoasAtendidas++;
        System.err.printf("Atendendo ao cliente n° (%d) no caixa %d\n", pessoasAtendidas, this.numCaixa);
    }

    public static void clientesAtendidos(){
        System.out.println("Numero de clientes atendidos: "+ pessoasAtendidas);
    }
}
