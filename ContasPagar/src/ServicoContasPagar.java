import javax.swing.text.Document;

public class ServicoContasPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContasPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        metodoPagamento.pagar(documento);
    }
}
