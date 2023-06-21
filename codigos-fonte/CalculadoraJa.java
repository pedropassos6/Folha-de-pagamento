import java.util.Scanner;

public class CalculadoraJa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double numero1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        double numero2 = sc.nextInt();
        System.out.print("Escolha a operacao: [1 para adicao, 2 para subtracao, 3 para multiplicacao, 4 para divisao] ");
        int operacao = sc.nextInt();

        double operacaoCalculo = 0;

        if(operacao == 1){
            operacaoCalculo = numero1 + numero2;
        }if(operacao == 2){
            operacaoCalculo = numero1 - numero2;
        }if(operacao == 3){
            operacaoCalculo = numero1 * numero2;
        }if(operacao == 4){
            operacaoCalculo = numero1 / numero2;
        }
        System.out.printf("%.2f" ,operacaoCalculo);

    }
}
