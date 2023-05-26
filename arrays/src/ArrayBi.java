public class ArrayBi {
    public static void main(String[] args) {

        String[][] cidades = new String[3][];

        cidades[0] = new String[1];
        cidades[0][0] = "Curitiba";

        cidades[1] = new String[2];
        cidades[1][0] = "Leeds";
        cidades[1][1] = "London";

        cidades[2] = new String[1];
        cidades[2][0] = "Paris";
//
//        for (String[] cidade : cidades){
//            for (String nomeCidade : cidade){
//                System.out.println(nomeCidade);
//            }
//        }

        for (int i = 0; i < cidades.length; i++){
            for ( int j = 0; j < cidades[i].length; j++){
                System.out.println(cidades[i][j]);
            }
        }


    }
}
