public class CalculadoraImc {
    double altura;
    double peso;

    double Calculo(){
        double calculo = peso / (altura * altura);
        return calculo;
    }
}
