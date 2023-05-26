public class Principal {

    public static void main(String[] args) {
//        int areaEntrada = 2;
        FormulasMatematicas formulasMatematicas = new FormulasMatematicas();
//        formulasMatematicas.area = 2;
//        System.out.printf("%d%n", formulasMatematicas.areaDoQuadrado());
//
//        formulasMatematicas.raio = 3;
//        System.out.printf("%f", formulasMatematicas.areaCirculo());

//        FormulasMatematicas.areaDoQuadrado(2);
        System.out.printf("%.2f%n", FormulasMatematicas.areaDoQuadrado(2));
        System.out.printf("%.4f%n", FormulasMatematicas.areaCirculo(3));


    }
}
