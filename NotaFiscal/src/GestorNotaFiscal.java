public class GestorNotaFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais){
        for (NotaFiscal notaFiscal : notasFiscais){
            notaFiscal.emitir();
            System.out.println("--------------");
        }
    }
}
