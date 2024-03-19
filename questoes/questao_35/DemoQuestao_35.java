package questoes.questao_35;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoQuestao_35 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Questao_35> clientes = new ArrayList<>();

    while (true) {
        System.out.println("");
        System.out.println("Digite o id ou (id negativo para encerrar.)");
        int id = input.nextInt();
        if(id < 0){
            break;
        }
        
        input.nextLine();
        System.out.println("");
        System.out.println("Digite o nome do cliente: ");
        String nome = input.nextLine();

        System.out.println("");


        System.out.println("Digite a idade: ");
        int idade = input.nextInt();

        System.out.println("");
        input.nextLine();


        System.out.println("Digite o telefone: ");
        String telefone = input.nextLine();

        Questao_35 cliente = new Questao_35(id, idade, nome, telefone);
        clientes.add(cliente);

    }
    System.out.println("");
    System.out.println(clientes.toString());
    input.close();
   }
}
