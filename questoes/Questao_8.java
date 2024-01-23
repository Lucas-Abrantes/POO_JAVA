package questoes;

import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        String codigo;
        float valor;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o codigo: ");
        codigo = input.next();

        System.out.println("Informe o valor do produto: ");
        valor = input.nextFloat();

        if(codigo.equals("111") || codigo.equals("222")){
            try {
                System.out.println("Acessando setor responsavel");
                Thread.sleep(2000);
                if(valor >= 500 && codigo.equals("222")){
                    System.out.println("Esse produto tem 10% de desconto");
                }
                 if(valor <= 500 && codigo.equals("222")){
                    System.out.println("Valor abaixo de 500 reais nao tem desconto");
                }
                else if(valor >= 100 && codigo.equals("111")){
                    System.out.println("Esse produto tem 40% de desconto");

                }else if((valor >= 50 &&  valor < 100) && codigo.equals("111")){
                    System.out.println("Desconto de 20%");

                }else if(valor < 50 && codigo.equals("111")){
                    System.out.println("Desconto de 10%");
                }
              
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Codigo invalido. Tente mais uma vez");
        }

    }
        
}
