import java.io.InputStream;
import java.util.Scanner;

public class TreinandoOperadores {
    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        boolean numerosIguais = 10 == 10;
        System.out.printf("numeros iguais: %b%n", numerosIguais);

       // boolean numerosDiferentes = !numerosIguais;
        //boolean numerosDiferentes = numero1 != numero2;

        //comparacao entre tipos string

        String nome1 = "pedro";
        String nome2 = "henrique";

        boolean nomesIguais = nome1 == nome2;

        System.out.printf("nomes iguais: %b%n", nomesIguais);

        //operadores de comparacao

        int pesoProdutos = 900;
        int limitePeso = 1000;

        boolean cargaExcedida = pesoProdutos > limitePeso;
        System.out.printf("carga excedida: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoProdutos <= limitePeso;
        System.out.printf("carga liberada: %b%n", cargaLiberada);

        //operadores logico

        System.out.println("cortisol: ");
        double cortisol = sc.nextDouble();
        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;

        System.out.printf("cortisol normal: %b%n", resultadoNormal);

        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
        System.out.printf("cortisol anormal: %b%n", resultadoAnormal);

        System.out.println("digite um ano: ");
        int ano = sc.nextInt();

        boolean calculo = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;
        System.out.println("O ano é bissexto: " +calculo);

        // operadores de cuirto circuito











    }
}
