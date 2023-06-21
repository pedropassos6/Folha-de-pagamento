public class Concurso {
    public static void main(String[] args) {
        int notaMatematica = 100;
        int notaPortugues = 59;
        int notaTotal = notaPortugues + notaMatematica;

        if(notaTotal >= 150 && notaMatematica >= 60 && notaPortugues >= 60){
            System.out.println("Parabens, voce foi aprovado.");
        }else{
            System.out.println("Voce não conseguiu passar.");
        }

    }
}
