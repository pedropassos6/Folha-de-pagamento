import java.util.Scanner;

public class HorarioFunc {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um dia da semana: ");
        String diaSemana = sc.nextLine();


        switch (diaSemana){
            case "seg":
                diaSemana = "fechado";
                break;
            case "ter":
            case "qua":
            case "qui":
            case "sex":
                diaSemana = "Das 8:00 as 18:00";
                break;
            case "sab":
            case "dom":
                diaSemana = "Das 9:00 as 12:00";
                break;
            default:
                diaSemana = "Dia invalido";

        }

        System.out.printf("Horario de funcionamento: %s%n", diaSemana);
    }
}
