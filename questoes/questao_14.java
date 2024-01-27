package questoes;

import java.util.Scanner;

public class questao_14 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        num = input.nextInt();
        if (num < 0) {
            System.out.println("Não existe recursão para valores negativos");
        } else {
            int[] result = fibSeries(num);
            System.out.println("Fibonacci(" + num + "): " + calculaFib(num));

            System.out.println("\n");
            System.out.println("N-esimo termo: ");
            
            for(int i = 0; i < num; i++){
                System.out.print(result[i]+ " ");
            }
        }
        input.close();
        System.out.println("\n");
    }


    public static int calculaFib(int num){
        if(num <= 1 ){
            return num;
        }
        return  calculaFib(num - 1) + calculaFib( num - 2);
    }


    public static int[] fibSeries(int num){
        int[] fib = new int[num];
        int a = 0, b = 1;

        for(int i = 0; i < num; i++){
            fib[i] = a;
            int temp = a;
            a = b;
            b = temp + a;
        }
        return fib;
    }
}
