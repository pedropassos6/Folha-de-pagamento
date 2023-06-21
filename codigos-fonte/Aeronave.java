import java.util.Scanner;

public class Aeronave {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso da aeronave: ");
        int pesoSuportado = sc.nextInt();

        System.out.println("Digite a quantidade de passageiros: ");
        int quantidadePassageiros = sc.nextInt();


        int pesoTotalPassageiros = 0;

        for(int i=1; i <= quantidadePassageiros; i++){
            System.out.printf("Digite o peso do passageiro #%d: ", i);
            int pesoPassageiro = sc.nextInt();

            pesoTotalPassageiros += pesoPassageiro;

        }

        System.out.printf("Peso total dos Passageiros: %d KG%n", pesoTotalPassageiros);
        System.out.printf("Situação da Aeronave: %s%n ", pesoTotalPassageiros > pesoSuportado ? "Recusada" : "Liberada");


    }
}
