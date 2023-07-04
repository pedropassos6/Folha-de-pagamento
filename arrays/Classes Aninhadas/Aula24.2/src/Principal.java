public class Principal {
    public static void main(String[] args) {


        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("pedro@gmail.com", "binhaca@gmail.com", "Hi there!!!");

        ServicoEmail servicoEmail = new ServicoEmail();

        servicoEmail.enviar(mensagem);

//        System.out.printf(mensagem);
    }
}
