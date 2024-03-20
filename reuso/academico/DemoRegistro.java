package reuso.academico;

public class DemoRegistro {
    public static void main(String[] args) {
        RegistroAcademico alunoGrad = new RegistroAcademico("Ricardo", "2023113907", "BTI");
        RegistroPosGraduacao alunoPos = new RegistroPosGraduacao("Luana", "2022178798", "Ecologia", "Estudo do semi-arido", "Lucas");
        RegistroPosGraduacao alunoPos2 = new RegistroPosGraduacao(alunoGrad, "IA aplicada agricultura", "Joana");
        System.out.println(alunoGrad);
        System.out.println(alunoPos);
        System.out.println(alunoPos2);
    }
}
