package questoes.questao_30;

public class Questao_30 {
    
    private int a, b, c, d, e;


    public static int maximo(int a, int b){
        return Math.max(a, b);
    }

    public static int maximo(int a, int b, int c){
        return Math.max(a,Math.max(b, c));
    }

    public static int maximo(int a, int b, int c, int d){
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int maximo(int a, int b, int c, int d, int e){
        return Math.max(Math.max(Math.max(a, b), Math.max(c, d)),e);
    }

    
}
