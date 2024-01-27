package exemplos.registro;

public class RegistroAcademico {
    
    private String nome, matricula;
    private int codigoCurso;
    private double percentualCobranca;

    public void inicializaRegistro(String n, String m, int cod, double per){
        nome = n;
        matricula = m;
        codigoCurso = cod;
        percentualCobranca = per;
    }

    public double calculaTaxa(){
        return 100 * percentualCobranca * codigoCurso;
    }
}
