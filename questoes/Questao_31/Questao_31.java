package questoes.Questao_31;

public class Questao_31 {

        private static int numeroDeMatriculas = 0;
        private String nome;
        private String matricula;
        private int codigoCurso;
        private double percentualDeCobranca;
        
        public Questao_31(String matricula){
            numeroDeMatriculas++;
            this.matricula = "MAT: " + numeroDeMatriculas;
        }


        public void inicializaRegistroAcademico(String n, int cod, double perc) {
            nome = n;
            codigoCurso = cod;
            percentualDeCobranca = perc;
        }
    
        public double calculaMensalidade() {
            return 100 * codigoCurso * percentualDeCobranca;
        }

        public void numeroMatriculados(){
            System.out.println(numeroDeMatriculas);
        }

        public String getNome(){
            return nome;
        }

        public int getCodCurso(){
            return codigoCurso;
        }

        public String getMatricula(){
            return this.matricula;
        }
    }
    

