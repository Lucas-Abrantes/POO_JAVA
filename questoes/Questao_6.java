package questoes;

import java.util.Scanner;

public class Questao_6 {
    
    public static void main(String[] args) {
        
        int minutos, horas, dias, num;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor em minutos: ");
        num = input.nextInt();

        System.out.printf("Valor em dias: %d\n", num/(60 * 24));
        System.out.printf("Valor em horas: %d\n", num % (60 * 24)/60);
        System.out.printf("Valor em minutos: %d", num % 60);
    }
}
