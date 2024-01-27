package exemplos.evento;

public class EventoAcademico {
    private String nomeDoEvento, localDoEvento;
    private int numeroDeParticipantes;

    // construtor tem o mesmo nome da classe e não tem retorno
    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }


    public void mostraEvento(){
        System.out.println("Nome do evento: " + this.nomeDoEvento);
        System.out.println("Local do evento: " + this.localDoEvento);
        System.out.println("Quantidade de pessoas: " + this.numeroDeParticipantes);
    }

}
