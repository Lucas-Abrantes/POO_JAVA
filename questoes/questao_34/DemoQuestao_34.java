package questoes.questao_34;

public class DemoQuestao_34 {
    public static void main(String[] args) {
        Questao_34 matriz = new Questao_34(1, 2, 3, 4);
        System.out.println(matriz.calculaDeterminante());
        matriz.imprimeMatriz();
    }
}
