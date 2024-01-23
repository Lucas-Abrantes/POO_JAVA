package questoes;


import java.util.Scanner;

public class Questao_5 {
   
    public static void main(String[] args) {
        int num_CDU;
        String num_UDC;
        char unidade, dezena, centena;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o num_CDU: ");
        num_CDU = input.nextInt();

        String numStr = Integer.toString(num_CDU);

        if(numStr.length() != 3){
            System.out.println("O numero digitado nao tem 3 digitos");
        }
        else{
            centena = numStr.charAt(0);
            dezena = numStr.charAt(1);
            unidade = numStr.charAt(2);
            num_UDC = "" + unidade + dezena + centena;
            System.out.println(num_UDC);
        }
        input.close();
    }
}