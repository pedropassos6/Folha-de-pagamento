public class Calendario {



    String obterMes(int escolha){

        String[] mes = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        return mes[escolha -1];

    }

    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        String escolha = calendario.obterMes(4);
        System.out.println(escolha);



    }
}
