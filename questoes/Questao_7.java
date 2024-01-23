package questoes;

import java.util.Scanner;

public class Questao_7{
    
    public static void main(String[] args) {
        
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = input.nextInt();

        if(num1 < num2  && num1 < num3){
            System.out.println("O primeiro valor e menor");
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println("O segundo valor e menor");
        }
        else{
            System.out.println("O terceiro valor e menor");
        }
    }
}
