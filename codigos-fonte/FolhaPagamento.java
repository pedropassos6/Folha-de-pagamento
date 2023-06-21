import java.util.Scanner;

public class FolhaPagamento {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.nextLine();
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhada: ");
        int horasTrabalhada = sc.nextInt();
        System.out.print("Digite o valor dos descontos: ");
        double descontos = sc.nextDouble();
        double valorTotal = valorHora * horasTrabalhada;

        System.out.printf("Folha de Pagamento: %s%n", nome);
        System.out.printf("%d horas x R$: %.2f = R$: %.2f%n",horasTrabalhada, valorHora, valorTotal);
        System.out.printf("Descontos: %.2f%n", descontos);
        System.out.printf("Total Devido: %.2f%n", valorTotal - descontos);
    }
}
