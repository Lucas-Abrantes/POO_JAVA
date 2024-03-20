package reuso.empresa;

public class DemoEmpresa {
    
    public static void main(String[] args) {
        
        Pessoa pessoa_1 = new Pessoa("Lucas", 1, 23);
        System.out.println(pessoa_1.toString());

        System.out.println("\n");

        Funcionario funcionario_1 = new Funcionario("Marcos", 1, 30, "Engenheiro civil", 8, 2500.00);
        System.out.println(funcionario_1.toString());

        ChefeDepartamento chefe_1 = new ChefeDepartamento("Maria", 3, 40, "Médica", 6, 4000.0, "Cirugia","Departamento de cirugia geral");
        System.out.println(chefe_1.toString());
    }
}
