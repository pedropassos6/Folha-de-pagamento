import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        final int IDADE_MINIMA_PARA_APOSENTAR = 55;
        final int TEMPO_MINIMO_CONTRIBUICAO = 25;

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt(); //idade minima 55
        System.out.println("Digite o tempo de contriubição: ");
        int tempoDeContribuicao = sc.nextInt(); //tempo minimo 25

        boolean temIdadeParaAposentar = idade >= 55;
        boolean tempoMinimoContribuicao = tempoDeContribuicao >= 25;
        boolean apto = temIdadeParaAposentar && tempoMinimoContribuicao;

        if(apto) {
            System.out.println("Voce pode se aposentar");
        }
        else {
            System.out.println("Voce ainda não pode se aposentar");
        }

    }
}
