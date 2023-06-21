public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private NotaStatus status = NotaStatus.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

//    public int getStatus() {
//        return status;
//    }

    public void cancelar() {
       if(status.mudarParaCancelado(getValor())) {
           status = NotaStatus.CANCELADA;
       }else{
           throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
       }
    }

    public void emitir() {
        if (status == NotaStatus.EMITIDA || status == NotaStatus.CANCELADA) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = NotaStatus.EMITIDA;
    }

    public String getDescricaoCompleta() {
        String descricaoStatus = switch (status) {
            case NAO_EMITIDA -> "Não emitida";
            case EMITIDA -> "Emitida";
            case CANCELADA -> "Cancelada";
            default -> throw new RuntimeException("Status não tratado");
        };

        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), descricaoStatus);
    }

}