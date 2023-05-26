public class Principal {
    public static void main(String[] args) {

        GestorNotaFiscal gestor = new GestorNotaFiscal();

        var nfBolaFutebol = new NotaFiscalProduto("bola de futebol", 60, 5);
        var nfReparoMotor = new NotaFiscalServico("troca da correia", 1800, true);

        gestor.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }
}
