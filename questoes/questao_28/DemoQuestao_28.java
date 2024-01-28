package questoes.questao_28;

public class DemoQuestao_28 {
    public static void main(String[] args) {
        Questao_28 lamp = new Questao_28();
        lamp.exibeEstado();

        lamp.liga();
        
        lamp.desliga();
        lamp.liga();
        lamp.exibeEstado();

        lamp.mostraQuantidade();
    

    }
}
