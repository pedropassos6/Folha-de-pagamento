public class Principal {
    public static void main(String[] args) {

        Horario horario = new Horario(12, 43);
//        System.out.printf("%dh%dm", horario.getHora(), horario.getMinuto());
        System.out.println(horario.formatar());
    }
}
