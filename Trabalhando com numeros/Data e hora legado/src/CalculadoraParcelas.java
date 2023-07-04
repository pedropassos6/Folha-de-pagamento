import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraParcelas {

    public List<Date> calcular(Date dataPrimeiraParcela, int quantidadeParcelas){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrimeiraParcela);

        limparHora(calendar);

        int diaPrimeiraParcela = calendar.get(Calendar.DAY_OF_MONTH);

        List<Date> dataParcelas = new ArrayList<>();
        dataParcelas.add(calendar.getTime());

        for (int i = 2; i <= quantidadeParcelas; i++){
            calendar.add(Calendar.MONTH, 1);

            int ultimoDiaMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int vencimentoParcelaAtual = calendar.get(Calendar.DAY_OF_MONTH);

            if (vencimentoParcelaAtual < diaPrimeiraParcela && diaPrimeiraParcela <= ultimoDiaMes){
                calendar.set(Calendar.DAY_OF_MONTH, diaPrimeiraParcela);
            }

            dataParcelas.add(calendar.getTime());
        }

        return dataParcelas;
    }

    private static void limparHora(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }


}
