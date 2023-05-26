public class TestesMemoria {

    public static void main(String[] args) {

        calcularTempo();
        byte[] x = new byte[500 * 1024 * 1024];
        calcularTempo();

    }

    static void calcularTempo(){
        System.out.printf("Total disponivel: %s%n", calculo(Runtime.getRuntime().maxMemory()));

        System.out.printf("Reservado pela JVM para essa execução: %s%n", calculo(Runtime.getRuntime().totalMemory()));

        System.out.printf("Total disponivel após uso: %s%n", calculo(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.printf("Usando para essa execução: %s%n", calculo(memoriaUsada));

        System.out.println("-------------------------------------------------------");

    }

    static String calculo(long bytes){
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
