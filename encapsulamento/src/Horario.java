public class Horario {

    private int[] valores = new int[2];
//    private int hora;
//    private int minuto;

    public Horario(int hora, int minuto){
        setHora(hora);
        setMinuto(minuto);

    }

    public int getHora(){
        return valores[0];
    }

    public void setHora(int hora){
        if(hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora invalida");
        }

        this.valores[0] = hora;
    }

    public int getMinuto(){
        return valores[1];
    }

    public void setMinuto(int minuto){
        if(minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto invalido");
        }

        this.valores[1] = minuto;
    }

    public String formatar(){
        return String.format("%dh%dm",getHora() ,getMinuto());
    }
}
