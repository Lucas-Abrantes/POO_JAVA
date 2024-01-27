package questoes.questao_25;

public class Questao_25 {
    
    private String nome, matricula;
    private float nota_1, nota_2, nota_trabalho;

    public Questao_25(String nome, String matricula, float nota_1, float nota_2, float nota_trabalho){
        this.nome = nome;
        this.matricula = matricula;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_trabalho = nota_trabalho;
    }


    public float mediaAluno(){
        return (2.5F * this.nota_1 + 2.5F * this.nota_2 + 2F * this.nota_trabalho)/7;
    }

    public float notaFinal(){
        float media = mediaAluno();
        if(media > 3  || media >= 7){
            return 0;
        }
        else{
            return  ((5F - (media * 6F) / 10F) * (10F / 4.0F));
        }
    }

    public void nomeAluno(){
        System.out.println("Nome do aluno: " + this.nome);
    }


    public void exibeMatricula(){
        System.out.println("Numero da matricula: " + this.matricula);
    }

    public void exibeNotas(){
        System.out.println("Nota 1: " + this.nota_1);
        System.out.println("Nota 2: " + this.nota_2);
        System.out.println("Nota do trabalho: " + this.nota_trabalho);
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Matricula: " + this.matricula + "\n" +
                "Nota 1: " + this.nota_1 + "\n" +
                "Nota 2: " + this.nota_2 + "\n" +
                "Nota do trabalho:" + this.nota_trabalho + "\n";
    }

}
