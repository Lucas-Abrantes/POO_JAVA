package reuso.academico;

public class RegistroPosGraduacao {
    private String tituloTese;
    private String orientador;
    private RegistroAcademico academico;

    public RegistroPosGraduacao(String nomeDoAluno, String matricula, String curso, String tituloTese, String orientador){
        this.academico = new RegistroAcademico(nomeDoAluno, matricula, curso);
        this.orientador = orientador;
        this.tituloTese = tituloTese;
    }

    public RegistroPosGraduacao(RegistroAcademico academico, String orientador, String tituloTese){
        this.academico = academico;
        this.orientador = orientador;
        this.tituloTese = tituloTese;
    }

    public String toString() {
        return academico.toString() + ", tituloTese=" + tituloTese + ", orientador="+ orientador;
    }
    
}
