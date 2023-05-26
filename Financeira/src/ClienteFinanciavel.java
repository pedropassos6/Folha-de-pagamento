public interface ClienteFinanciavel {

    public abstract double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado){
        if (valorSolicitado <= 100000){
            return 1.0;
        }else if (valorSolicitado <= 1000000){
            return 1.5;
        }
        return 2.0;
    }


}
