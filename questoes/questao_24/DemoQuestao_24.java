package questoes.questao_24;

public class DemoQuestao_24 {
    public static void main(String[] args) {
        Questao_24 cliente = new Questao_24("2506", "Refrigerante Coca-Cola lata 300ml", 3, 4.5F);

        // cliente.calculaTotalCompras();

        // cliente.verificaPreco();
        // cliente.verificaQuantidade();

        // String cliente1 = cliente.toString();
        // System.out.println(cliente1);

        Questao_24 cliente2 = new Questao_24("2506", "Refrigerante Coca-Cola lata 300ml", 0, 0F);

        cliente2.verificaPreco();

    }
}
