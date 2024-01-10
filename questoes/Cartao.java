package questoes;
import java.util.Calendar;
import java.util.Scanner;


public class Cartao {
    public static void main(String[] args) {
        String nome;
        int num, cod, mes, ano, anoAtual, mesAtual;
        boolean dataInvalida;

        Scanner input = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        mesAtual = 1 + calendario.get(Calendar.MONTH);
        anoAtual = calendario.get(Calendar.YEAR);

        System.out.println("Digite o nome: ");
        nome = input.nextLine();

        System.out.println("Digite o numero: ");
        num = input.nextInt();

        System.out.println("Digite o codigo: ");
        cod = input.nextInt();

        do{
            System.out.println("Digite o mes de validade: ");
            mes = input.nextInt();

            System.out.println("Digite o ano atual: ");
            ano = input.nextInt();

            dataInvalida = (ano < anoAtual) || (ano == anoAtual && mes < mesAtual);
            if(dataInvalida){
                System.out.println("Os dados são invalidos");
            }
        }while(dataInvalida);

        System.out.println("Os dados estao corretos.");
        input.close();

    }
}
