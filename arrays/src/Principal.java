public class Principal {
    public static void main(String[] args) {
        double[] i = new double[]{30.4, 123.90, 57.98, 94.50, 38.88};

        TabelaValores valores = new TabelaValores();


        CalculadoraArray calculadora = new CalculadoraArray();
        calculadora.valores[0].valor = 32;
        calculadora.valores[0].data = "23/04/2023";
        double media = CalculadoraArray.calcularMedia(i);

        System.out.printf("%.2f%n", i[0] + i[1] + i[2] + i[3] + i[4]);
        System.out.printf("%.2f%n", media);

//        i = new int[]{3, 4, 5, 9, 8};
//        System.out.println(i[2]);
//        System.out.println(i[4]);
//        System.out.println(i[0]);
    }
}
