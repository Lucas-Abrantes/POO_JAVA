package questoes.questao_28;

public class Questao_28 {
    
    private boolean estadLampada;
    private Contador cont;

    public Questao_28(){
        this.estadLampada = false;
        this.cont = new Contador();
    }

    public void liga(){
        if(!this.estadLampada){
            this.estadLampada = true;
            cont.incrementar();          
        }    
    }


    public void desliga(){
        this.estadLampada = false;
    }


    public void exibeEstado(){
        System.err.println("Estado atual da lampada: " + this.estadLampada);
    }


    public void mostraQuantidade(){
        System.out.println(cont.getValor());
    }


    public class Contador{

        private int valor;

        public void incrementar(){
            this.valor++;
        }

        public int getValor(){
            return this.valor;
        }
    }
}
