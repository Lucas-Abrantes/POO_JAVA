package exemplos.natal;

public class DataNatal {
    private int dia, mes, ano;

    public boolean dataValida(){
        return (dia >= 1 && mes >= 1 && mes <= 12 && ano > 0);
    }

    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public void exibeData(){
        System.out.println(dia + " / " + mes + " / " + ano);
    }

    public static DataNatal natal(int ano){
        DataNatal dNatal = new DataNatal();
        dNatal.inicializaData(25, 12, ano);
        return dNatal;
    }
}
