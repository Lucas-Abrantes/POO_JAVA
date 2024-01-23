package exemplos;
import java.util.Scanner;


public class BoasVindas {
    public static void main(String[] args) {
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = input.next();

        System.out.printf("Seja bem vindo(a): %s", nome);
        input.close();
    }
}
