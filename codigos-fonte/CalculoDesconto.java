import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.print("Escolha o metodo de pagamento [1 para a vista / 2 para a prazo]: ");
        int metodoPagamento = sc.nextInt();

        boolean aVista = metodoPagamento == 1;

        double acrescimo = 0.0;
        if(!aVista){
            acrescimo = 10;
        }

        double valorAcrescimo = valorProduto * acrescimo / 100;
        double valorTotal = valorProduto + valorAcrescimo;
        System.out.println("Valor total do produto: " +valorTotal);

    }
}
