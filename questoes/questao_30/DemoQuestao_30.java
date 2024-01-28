package questoes.questao_30;

public class DemoQuestao_30 {
    public static void main(String[] args) {
        Questao_30 valores = new Questao_30();

        System.out.println(valores.maximo(1, 3));
        System.out.println(valores.maximo(15, 20, 50));
        System.out.println(valores.maximo(1, 4, 6, 10));
        System.out.println(valores.maximo(4, -1, 10, 7, 102));
    }
}
