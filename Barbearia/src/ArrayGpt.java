import java.util.Scanner;
import java.util.Arrays;

public class ArrayGpt {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira o tamanho do array: ");
            int tamanho = scanner.nextInt();


            int[] array = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Insira o número para a posição " + i + ": ");
                int numero = scanner.nextInt();
                array[i] = numero;
            }

            System.out.println("O array é: " + Arrays.toString(array));
        }

}
