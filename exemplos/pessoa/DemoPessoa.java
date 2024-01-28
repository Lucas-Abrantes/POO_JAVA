package exemplos.pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Pedro", 1.75);
        System.out.println(pessoa.toString());
        System.out.println("");
        pessoa.setNome("Maria");
        pessoa.setAltura(1.64);

        System.out.println(pessoa.toString());
       

    }
}
