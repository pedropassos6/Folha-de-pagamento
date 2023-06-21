import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        for (int i=1; i<=10; i++){
            int calc = i * numero;
            System.out.printf("%d X %d = %d%n", numero , i, calc);
        }
    }
}
