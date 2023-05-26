public class CalculadoraArray {
    TabelaValores[] valores;

    static double calcularMedia(double[] numero){
        double total = 0;
        for(int i = 0; i < numero.length; i++){
            total += numero[i];
        }
        return total / 2;
    }
}
