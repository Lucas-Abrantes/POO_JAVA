package questoes.questao_23;

public class DemoQuestao_23 {
    public static void main(String[] args) {
        Questao_23 time1 = new Questao_23("Flamengo", 10, 2, 8, 0, 1);
        System.out.println("");
        time1.exibirNome();
        time1.quantDerrotas();
        time1.quantVitorias();
        
        System.out.println("");
        String exibir = time1.toString();
        System.out.println(exibir);
    }
}
