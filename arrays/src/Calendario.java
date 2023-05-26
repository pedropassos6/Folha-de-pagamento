public class Calendario {

    String obterNomeMes(int mesEscolhido){

        String[] mes = {"jan", "fev", "mar", "abri", "maio", "jun", "jul", "ago", "set", "out", "nov", "dez"};

        return mes[mesEscolhido - 1];


    }

//    String[] mes = {"jan", "fev", "mar", "abri", "maio", "jun", "jul", "ago", "set", "out", "nov", "dez"};
//
//    static String obterNomeMes(int numeroMes){
//        for (int i = 1; i < 13; i++){
//            String mesEscolhido = numeroMes[i] mes[i];
//            return mesEscolhido;
////            String[] mes = {"jan", "fev", "mar", "abri", "maio", "jun", "jul", "ago", "set", "out", "nov", "dez"};
//
//        }
//    }


//    static String obterNomeMes(int numeroMes) {
//        return switch (numeroMes) {
//            case 1 -> "Janeiro";
//            case 2 -> "Fevereiro";
//            case 3 -> "Março";
//            case 4 -> "Abril";
//            case 5 -> "Maio";
//            case 6 -> "Junho";
//            case 7 -> "Julho";
//            case 8 -> "Agosto";
//            case 9 -> "Setembro";
//            case 10 -> "Outubro";
//            case 11 -> "Novembro";
//            case 12 -> "Dezembro";
//            default -> null;
//        };
//    }
}
