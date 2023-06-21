import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        //int numero = sc.nextInt();
        //int totalNumero = 0;
        int soma = 0;
        while (soma < 100){
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println(soma);
    }
}
