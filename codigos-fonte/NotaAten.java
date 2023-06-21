import java.util.Scanner;

public class NotaAten {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota: (1 a 5): ");
        int nota = sc.nextInt();
        String notaRecebe;

        switch (nota) {
            case 1:
                notaRecebe = "Muito Ruim";
                break;
            case 2:
                notaRecebe = "Ruim";
                break;
            case 3:
                notaRecebe = "aceitavel";
                break;
            case 4:
                notaRecebe = "Bom";
                break;
            case 5:
                notaRecebe = "Muito Bom";
                break;
            default:
                notaRecebe = "Indisponivel";
        }

        System.out.printf("Sua nota foi: %d - %s%n", nota, notaRecebe);


    }
}
