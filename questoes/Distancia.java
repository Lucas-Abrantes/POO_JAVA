package questoes;
import java.util.Scanner;


public class Distancia {
    public static void main(String[] args) {
        double x1, x2, y1, y2, dist;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de x1:");
        x1 = input.nextDouble();

        System.out.println("Digite o valor de x2:");
        x2 = input.nextDouble();

        System.out.println("Digite o valor de y1:");
        y1 = input.nextDouble();

        System.out.println("Digite o valor de y2:");
        y2 = input.nextDouble();

        dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Valor da distancia Euclidiana: %.2g", dist);

        input.close();
    }   
}
