import java.util.Scanner;

public class PesoAeronave {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso maximo do aviao: ");
        int pesoMaximo = sc.nextInt();

        System.out.print("Quantos passageiros? ");
        int quantidadePassageiros = sc.nextInt();

        int pesoTotalPassageiro = 0;

        for (int i = 1; i <= quantidadePassageiros; i++){
            System.out.printf("Digite o peso do passageiro #%d%n", i);
            int pesoPassageiro = sc.nextInt();

            pesoTotalPassageiro += pesoPassageiro;
        }

        System.out.printf("Peso Maximo da aeronave: %d%n", pesoMaximo);
        System.out.printf("Peso total de Passageiros: %d%n", pesoTotalPassageiro);
        System.out.printf("Situacao da aeronave: %s", pesoTotalPassageiro > pesoMaximo ? "Inviavel" : "liberado");




        sc.close();
    }
}
