import java.util.Scanner;

public class ValorProdutoQuantidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.print("Entre com a quantidade de produtos: ");
        int quantidadeProdutos = sc.nextInt();

        double subTotal = valorProduto * quantidadeProdutos;

        double desconto = 0;

        double total = 0;
        if(quantidadeProdutos >= 10){
            desconto = subTotal * 10 / 100;
            total = subTotal - desconto;
        }else{
            total = subTotal;
        }
        System.out.println("Valor do desconto: R$" +desconto);
        System.out.println("Valor Total: R$" +total);




    }
}
