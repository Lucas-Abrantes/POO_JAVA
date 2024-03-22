package questoes.questao_42;

public class DemoFuncionario {
    public static void main(String[] args) {
      

        Tecnico tec = new Tecnico("Marcos", 2000, 1256, "Controle e automação");
        System.out.println(tec.toString());
        System.out.println(tec.bonusSalarial(10));

        System.out.println("");

        Administrativo admin = new Administrativo("Maria", 1500, 2505);
        System.out.println(admin.toString());
    }    
}
