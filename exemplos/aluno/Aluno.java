package exemplos.aluno;

public class Aluno {
   
    String nome, matricula;
    float nota1F, nota2F, nota3F, notaFinalF;

    public Aluno(String nome, String matricula, float nota1F, float nota2F, float nota3F) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1F = nota1F;
        this.nota2F = nota2F;
        this.nota3F = nota3F; 
        this.notaFinalF = 0;
    }


    public void obterNome(){
       System.out.println("Nome do aluno: " + this.nome);
    }


    public void obterMatricula(){
        System.out.println("Numero da matricula: " + this.matricula);
    }


    public float calculaNotaFinal(){    
       return (this.nota1F + this.nota2F + this.nota3F)/3; 
    }


    public float obterNotaFinal(){
        return this.notaFinalF;
    }

    public void informarNotas(){
        System.out.println("Nota 1: " + this.nota1F);
        System.out.println("Nota 2: " + this.nota2F);
        System.out.println("Nota 3: " + this.nota3F);
    }

}
