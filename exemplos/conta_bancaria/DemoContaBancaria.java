package exemplos.conta_bancaria;

public class DemoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Lucas", 15.20, true);

        conta.imprimeDados();
        System.out.println("");

        conta.getNome();
        conta.setNome("Lucia");

        conta.getSaldo();
        conta.setSaldo(1200.00);
        conta.setEspecial(false);
        System.out.println("");

        conta.imprimeDados();
        
        // System.out.println("");
        // ContaBancaria conta2 = new ContaBancaria("Pedro");
        // conta2.imprimeDados();
    }
}
