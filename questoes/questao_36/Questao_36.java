package questoes.questao_36;

public class Questao_36 {
    static int resultado = 1;

    public static int caculaProduto(int... numeros){
        for(int numero: numeros){
            resultado*= numero;
        }
        return resultado;
    }

    public void exibe(){
        System.out.println("Resultado: " + caculaProduto(1,1,1,2, 10));
    }
}
