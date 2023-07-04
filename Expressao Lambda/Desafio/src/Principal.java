import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));


        // remover funcionários inativos
//        Predicate<Funcionario> predicate = funcionario -> funcionario.isInativo();
//        funcionarios.removeIf(predicate);

        funcionarios.removeIf(Funcionario::isInativo);

        // ordenar funcionários pelo valor do salário
//        Function<Funcionario, BigDecimal> function = Funcionario::getSalario;
//        funcionarios.sort(Comparator.comparing(function));

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));



        // iterar e imprimir funcionários usando o método estático imprimir
//        funcionarios.forEach(System.out::println);

//        Consumer<Funcionario> consumer = funcionario -> imprimir(funcionario);
//        funcionarios.forEach(consumer);

        funcionarios.forEach(Principal::imprimir);

//        for(Funcionario funcionario : funcionarios){
//            imprimir(funcionario);
//        }


    }

    private static void imprimir(Funcionario funcionario) {
        // implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("Nome: %s, Salário: R$: %.2f, Valor Imposto: R$: %.2f%n", funcionario.getNome(),
                funcionario.getSalario(), CalculoImposto.calcular(funcionario));
    }

}