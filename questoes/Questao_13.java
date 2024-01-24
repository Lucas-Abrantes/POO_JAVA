package questoes;

import java.util.Random;

public class Questao_13 {
    
    public static void main(String[] args) {
        int linha = 6, coluna = 10;

        int[][] megaSena = generateRandomNumbers(linha, coluna);
        imprimeCartao(megaSena);
        System.out.println("\n");    
    }
    
    private static int[][] generateRandomNumbers(int linha, int coluna){
        int[][] cartao = new int[linha][coluna];
        Random random = new Random();

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                cartao[i][j] = random.nextInt(60) + 1;
            }
        }
        System.out.println("\n");
        return cartao;
    }

    private static void imprimeCartao(int[][] cartao){
        System.out.println("\n");
        System.out.println("\t\t\t\tCartão da MEGA-SENA:");
        System.out.println("\n");
        for (int i = 0; i < cartao.length; i++) {
           
            for (int j = 0; j < cartao[i].length; j++) {
               
                System.out.print(String.format("\t%2d ", cartao[i][j])); // Ajusta o formato de impressão
            }
            System.out.println(); 
        }
    }

}
