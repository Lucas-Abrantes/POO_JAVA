package questoes;

import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        x1 = input.nextInt();

        System.out.println("Digite o valor de x2: ");
        x2 = input.nextInt();

        System.out.println("Digite o valor de y1: ");
        y1 = input.nextInt();

        System.out.println("Digite o valor de y2: ");
        y2 = input.nextInt();

        calculaPosicao(x1, x2, y1, y2);

        input.close();
    }

    public static void calculaPosicao(int x1, int x2, int y1, int y2){
        if(x2 > x1){
            System.out.println("x2 esta a dirita de x1");
        }
        else if(x1 > x2){
            System.out.println("x2 esta a esquerda de x1");
        }
        else{
            System.out.println("Ambos estao no mesmo ponto do plano cartesiano");
        }

        if(y2 > y1){
            System.out.println("y2 esta acima de y1");
        }
        else if(y1 > y2){
            System.out.println("y2 esta abaixo de y1");
        }
        else{
            System.out.println("Ambos estao no mesmo ponto do plano cartesiano");
        }
    }
}
