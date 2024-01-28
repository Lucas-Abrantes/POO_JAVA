package questoes.questao_27;

public class DemoQuestao_27 {
    public static void main(String[] args) {
        Questao_27 value = new Questao_27(10);
        System.out.println(value.getValor());
        System.out.println(value.setValor(0));
        
        value.incrementa();
        value.incrementa();
        value.incrementa();

        System.out.println(value.getValor());

     
    }
}
