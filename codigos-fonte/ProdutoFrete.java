import java.util.Scanner;

public class ProdutoFrete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        double valorFrete = 15;
        if(valorProduto <= 100){
            double valorTotal = valorProduto + valorFrete;
            System.out.println(valorTotal);
        }else{
            System.out.println(valorProduto);
        }

    }
}
