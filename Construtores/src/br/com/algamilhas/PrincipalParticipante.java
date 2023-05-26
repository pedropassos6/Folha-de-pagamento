package br.com.algamilhas;

import br.com.algamilhas.participante.Participante;

public class PrincipalParticipante {
    public static void main(String[] args) {

        Participante participante1 = new Participante();
        Participante participante2 = new Participante("Pedro");
        Participante participante3 = new Participante("Henriqiue", 300);

        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontos);

        System.out.println("--------------------------");

        System.out.println(participante2.nome);
        System.out.println(participante2.saldoDePontos);

        System.out.println("--------------------------");

        System.out.println(participante3.nome);
        System.out.println(participante3.saldoDePontos);



    }
}
