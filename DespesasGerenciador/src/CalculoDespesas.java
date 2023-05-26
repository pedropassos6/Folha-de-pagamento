import java.util.ArrayList;

public class CalculoDespesas {
    double valor;
    Despesas despesaCalculo;

    ArrayList<Despesas> despesas = new ArrayList<>();

    void adicionarDespesa(Despesas despesa){
        despesas.add(despesa);
    }

    void despesasTotais(){
        valor += despesaCalculo.valor;
        System.out.println(valor);
    }

    void imprimir(){
        for (Despesas despesa : despesas){
            System.out.println(despesa.valor + " - " + despesa.descricao);
        }
    }

}
