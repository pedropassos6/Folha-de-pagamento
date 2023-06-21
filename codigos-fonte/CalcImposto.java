import java.util.Scanner;

public class CalcImposto {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o tipo de nota fiscal? S ou P?");
        char tipoNota = sc.next().charAt(0);
        double totalFaturado = 1200;

        double taxaImposto = (tipoNota == 'S') ? 0.16 : 0.35;

        double valorImposto = totalFaturado * taxaImposto;

        System.out.printf("Total Faturado: %.2f%n", totalFaturado);
        System.out.printf("Total Imposto: %.2f%n", valorImposto);
        System.out.printf("Valor Total: %.2f%n", totalFaturado + valorImposto);
    }
}
