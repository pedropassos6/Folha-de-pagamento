import java.util.Scanner;

public class VitD {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("grupo de risco? ");
        boolean grupoRisco = sc.nextBoolean();

        System.out.println("Digite o valor de Vitamina D: ");
        int valor = sc.nextInt();

        boolean vitaminaNormal = !grupoRisco && valor >= 20
                || grupoRisco && valor >= 30 && valor <= 60;

        System.out.println("Grupo de risco: "+ grupoRisco);
        System.out.println("Vitamina normal: "+ vitaminaNormal);
    }
}
