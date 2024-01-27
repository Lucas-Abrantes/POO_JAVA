package exemplos.registro;

public class DemoRegistro {
    public static void main(String[] args) {
        double mensalidade;

        RegistroAcademico lucas = new RegistroAcademico();
        lucas.inicializaRegistro("Lucas", "80", 45, 0.3);
        mensalidade = lucas.calculaTaxa();
        System.out.println("Mensalidade: "+ mensalidade);

        RegistroAcademico roberto = new RegistroAcademico();
        // a classe RegistroAcademico permite que os metodos sejam executados
        // mesmo sem a inicialização dos atributos.
        System.out.println("Mens. Roberto: " + roberto.calculaTaxa());
        //Logo, roberto.calculaTaxa() retornará um zero.
    }
}
