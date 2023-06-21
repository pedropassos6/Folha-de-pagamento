import java.util.Scanner;

public class SimuladorEmprestimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = sc.nextInt();

        // switch expression aqui
        double taxaJuros = switch (quantidadeParcelas){
            case 1, 2 -> 1.99;
            case 3 -> 2.99;
            default -> 3.99;
        };

       /* double taxaJuros = switch (quantidadeParcelas){
            case 1, 2 -> {
                if (quantidadeParcelas == 1){
                    yield taxaJuros *= 1.99 / 100;

                }
            }
        };*/



        // use operador ternário aqui

        double tarifaFixa = valorEmprestimo < 100 ? 0 : 1.5;
        double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
        double custoTotal = valorEmprestimo + totalJuros;

        System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
        System.out.printf("Total de juros: R$%.2f%n", totalJuros);
        System.out.printf("Custo total: R$%.2f%n", custoTotal);
    }

}