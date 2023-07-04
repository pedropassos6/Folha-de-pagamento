import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em dolares");
        String valorDolar = sc.nextLine();

        System.out.println("Digite a cotação do dolar");
        String cotacaoDolar = sc.nextLine();

        DecimalFormat formatadorUs = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
        formatadorUs.setParseBigDecimal(true);

        DecimalFormat formatadorBr = new DecimalFormat("#,##0.00", new DecimalFormatSymbols
                (new Locale("pt", "BR")));
        formatadorBr.setParseBigDecimal(true);

        NumberFormat formatadorBrMoeda = new DecimalFormat("¤ #,##0.00", new DecimalFormatSymbols
                (new Locale("pt", "BR")));

        BigDecimal precoEmDolar = (BigDecimal) formatadorUs.parse(valorDolar);
        BigDecimal precoDolarCalculado = (BigDecimal) formatadorBr.parse(cotacaoDolar);

        BigDecimal valorReal = precoEmDolar.multiply(precoDolarCalculado);

        System.out.printf("Preço em reais: %s%n", formatadorBrMoeda.format(valorReal));
    }
}
