public class DivisivelWhile {
    public static void main(String[] args) {
        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };


        int i = 0;


        while (i <= numeros.length){
            int numero = numeros[i];
            int calculo = numero % 3;
            i++;

            if(calculo == 0){
                System.out.println(numero);

            }
////            int resultado = numeros[i] % 3;
//            if (i % 3 == 0){
//                System.out.println(numeros[i]);
//                i++;
//            }
        }
    }
}
