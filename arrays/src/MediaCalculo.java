import java.util.Arrays;

public class MediaCalculo {

    double calculo(double numero1, double numero2, double... numeros){
        double[] todoOsNumero = Arrays.copyOf(numeros, numeros.length + 2);
        todoOsNumero[todoOsNumero.length - 2] = numero1;
        todoOsNumero[todoOsNumero.length - 1] = numero2;

        double soma = 0;

        for (double numero : todoOsNumero){
            soma = soma + numero;
        }

        return soma / todoOsNumero.length;

    }
}
