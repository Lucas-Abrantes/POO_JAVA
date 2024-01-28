package exemplos.atendimento;

public class DemoAtendimento {
    public static void main(String[] args) {
        Atendimento pessoa = new Atendimento("Bruna", 8);
        pessoa.iniciaAtendimento();
        pessoa.iniciaAtendimento();

        Atendimento pessoa2 = new Atendimento("Flavio", 10);

        pessoa2.iniciaAtendimento();
        pessoa2.clientesAtendidos();

    }
}
