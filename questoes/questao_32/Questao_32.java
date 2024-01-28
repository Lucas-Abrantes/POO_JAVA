package questoes.questao_32;

public class Questao_32<X> {
    
    private X valor1;
    private X valor2;
    private X valor3;

    public Questao_32(X valor1, X valor2, X valor3){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public void verifica(){
        boolean val1EqualsVal2 = this.valor1.equals(this.valor2);
        boolean val1EqualsVal3 = this.valor1.equals(this.valor3);
        boolean val2EqualsVal3 = this.valor2.equals(this.valor3);

        if (val1EqualsVal2 && val1EqualsVal3) {
            System.out.println("Os 3 valores são iguais");
        } else if (val1EqualsVal2) {
            System.out.println("Valores 1 e 2 são iguais");
        } else if (val1EqualsVal3) {
            System.out.println("Valores 1 e 3 são iguais");
        } else if (val2EqualsVal3) {
            System.out.println("Valores 2 e 3 são iguais");
        } else {
            System.out.println("Todos os valores são diferentes");
        }
    }

    public void exibeElementos(){
        System.out.print("Valor 1: " + this.valor1);
        System.out.print("\nValor 2: " + this.valor2);
        System.out.print("\nValor 3: \n" + this.valor3);

    }
}
