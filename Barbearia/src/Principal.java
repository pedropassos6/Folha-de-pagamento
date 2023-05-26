public class Principal {
    public static void main(String[] args) {

        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "corte de cabelo");

        agendamentoCabelo.getHorario().setHora(20);

        horario.setHora(19);
        Agendamento agendamentoBarba = new Agendamento(horario, "corte de barba");


        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);


    }

    private static void imprimir(Agendamento agendamento){
        System.out.printf("%s ás %s%n", agendamento.getDescricao(), agendamento.getHorarioFormatado());
    }
}
