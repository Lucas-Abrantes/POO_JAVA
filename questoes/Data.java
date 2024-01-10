package questoes;
import java.util.Scanner;



public class Data {
   public static void main(String[] args) {
        int dia, mes, ano;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        dia = input.nextInt();

        System.out.println("Digite o mes: ");
        mes = input.nextInt();

        System.out.println("Digite o ano: ");
        ano = input.nextInt();

        System.out.print(dia + " de ");

        if(mes == 1){
            System.out.print("Janeiro");
        }else if(mes == 2){
            System.out.print("Fevereiro");
        }else if(mes == 3){
            System.out.print("Marco");
        }else if(mes == 4){
            System.out.print("Abril");
        }else if(mes == 5){
            System.out.print("Maio");
        }else if(mes == 6){
            System.out.print("Junho");
        }else if(mes == 7){
            System.out.print("Julho");
        }else if(mes == 8){
            System.out.print("Agosto");
        }else if(mes == 9){
            System.out.print("Setembro");
        }else if(mes == 10){
            System.out.print("Outubro");
        }else if(mes == 11){
            System.out.print("Novembro");
        }else if(mes == 12){
            System.out.print("Dezembro");
        }
        
        System.out.print(" de " + ano);
        switch(mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" tem 31 dias");
                break;
            case 2:
                System.out.println(" tem 28 dias");
                break;
            default:
                System.out.println(" tem 30 dias");
        }
        input.close();
   } 
}
