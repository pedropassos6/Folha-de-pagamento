public enum NotaStatus {

    NAO_EMITIDA{
        @Override
        public boolean mudarParaCancelado(double valor) {
            return false;
        }
    },
    EMITIDA{
        @Override
        public boolean mudarParaCancelado(double valor) {
            return valor >= 1_000;
        }
    },
    CANCELADA{
        @Override
        public boolean mudarParaCancelado(double valor) {
            return true;
        }
    };

    public abstract boolean mudarParaCancelado(double valor);


}
