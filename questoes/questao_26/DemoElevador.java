package questoes.questao_26;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador pessoa = new Elevador(4, 4);

        for(int i = 0; i < 5; i++){
            pessoa.entra();
        }

        for(int i = 0; i < 5; i++){
            pessoa.sobe();
        }

        for(int i = 0; i < 5; i++){
            pessoa.desce();;
        }
        
        for(int i = 0; i < 4; i++){
            pessoa.sai();
        }


        pessoa.exibeQuantidade();
        pessoa.exibeAndar();
    }
}
