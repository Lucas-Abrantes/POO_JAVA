public class tipos {
    public static void main(String[] args) throws Exception {

        //conversão explicita, o dado pe convertido pelo pragrama
        int v1 = 50;
        long v2 = v1;   
        System.out.println(v2);

        // em eperações do tipo inteiro, prevalece o dado com maior tamanho

        int v_1 = 100;
        short v_2 = 200;
        long v3 = 545456300;
        long result = v_1 + v_2 + v3;
        System.out.println(v3);

        //conversão explicita--> é necessário que o programador faça isso

        long x1 = 1512333200;
        short x2 = (short)x1;
        System.out.println(x2);

        // print formatado
        int valor1 = 10;
        int valor2 = 30;
        System.out.format("%d --> %d%n", valor1, valor2);

        int resp = valor1 > valor2 ? valor1 / valor2:0;
        System.out.println("Resultado: " + resp);

        char op = 'a';
        switch (op) {
            case 'a':
                System.out.println("opcao correta");
                break;
            
            default:
                System.out.println("Programa finalizado");
                break;
        }
    }
}
