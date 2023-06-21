import java.util.Scanner;

public class VitaminaD {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Grupo de Risco: ");
        boolean grupoDeRisco = sc.nextBoolean();

        System.out.print("Vitamina D: ");
        double vitamina = sc.nextDouble();

        boolean vitaminaDNormal = grupoDeRisco && vitamina >=30 && vitamina <=60
                || !grupoDeRisco && vitamina > 20;

        System.out.printf("Vitamina normal: %b%n", vitaminaDNormal);
    }
}
