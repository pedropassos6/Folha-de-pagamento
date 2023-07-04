import java.math.BigDecimal;

public class CalculoImposto {


//    private Funcionario funcionario;

    public static BigDecimal calcular(Funcionario funcionario){
        return funcionario.getSalario().multiply(new BigDecimal(0.20));
    }
}
