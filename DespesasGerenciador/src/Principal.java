public class Principal {
    public static void main(String[] args) {
        Despesas despesa = new Despesas();
        despesa.valor = 50.0;
        despesa.descricao = "supermercado";

        Despesas despesa1 = new Despesas();
        despesa1.valor = 72.0;
        despesa1.descricao = "Compras";

        Despesas despesa2 = new Despesas();
        despesa2.valor = 32.99;
        despesa2.descricao = "Almoço";

        CalculoDespesas calculoDespesas = new CalculoDespesas();

        calculoDespesas.adicionarDespesa(despesa);
        calculoDespesas.adicionarDespesa(despesa1);
        calculoDespesas.adicionarDespesa(despesa2);



        calculoDespesas.imprimir();

    //        calculoDespesas.despesasTotais();
    }
}
