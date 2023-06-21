import java.util.Scanner;

public class AnoBissexto {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        boolean multiplo = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;



        System.out.printf("Ano Bissexto: %b%n ", multiplo);
    }
}
