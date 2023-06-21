import java.util.Scanner;

public class IMC {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite true para masculino e false para feminino: ");
        boolean sexo = sc.nextBoolean();

        System.out.print("Digite seu peso: ");
        int peso = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double calcImc = peso / (altura * altura);


        if (sexo == true && calcImc < 20.7){
            System.out.printf("Abaixo do peso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == false && calcImc < 19.1){
            System.out.printf("Abaixo do peso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == true && calcImc >= 20.8 && calcImc <= 26.4){
            System.out.printf("Peso ideal, IMC: %.2f%n", calcImc);
        }
        else if (sexo == false && calcImc >= 19.1 && calcImc <= 25.8){
            System.out.printf("Peso ideal, IMC: %.2f%n", calcImc);
        }
        else if (sexo == true && calcImc >= 26.5 && calcImc <= 27.8){
            System.out.printf("Um pouco acima do peso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == false && calcImc >= 25.0 && calcImc <= 27.3){
            System.out.printf("Um pouco acima do peso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == true && calcImc >= 27.9 && calcImc <= 31.1){
            System.out.printf("Acima do peso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == false && calcImc >= 27.4 && calcImc <= 32.3){
            System.out.printf("Acima do peso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == true && calcImc > 31.1){
            System.out.printf("Obeso, IMC: %.2f%n", calcImc);
        }
        else if (sexo == false && calcImc > 32.3){
            System.out.printf("Obesa, IMC: %.2f%n", calcImc);
        }
    }
}
