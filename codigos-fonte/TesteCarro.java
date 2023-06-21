public class TesteCarro {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pedro";
        pessoa1.cpf = "890.899.322-43";
        pessoa1.anoNascimento = 1992;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Passos";
        pessoa2.cpf = "890.899.322-43";
        pessoa2.anoNascimento = 1992;


        Carro meuCarro = new Carro();
        meuCarro.fabricante = "BMW";
        meuCarro.modelo = "M135";
        meuCarro.cor = "Azul";
        meuCarro.anoFabricacao = 2019;
        meuCarro.valorVeiculo = 200000.00;
        meuCarro.proprietario = pessoa1;

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Audi";
        seuCarro.modelo = "RS3";
        seuCarro.cor = "Azul";
        seuCarro.anoFabricacao = 2020;
        seuCarro.valorVeiculo = 30000.00;
        seuCarro.proprietario = pessoa2;

        System.out.println(meuCarro.calcularValorRevenda());
        System.out.println(seuCarro.calcularValorRevenda());

        double ipva = meuCarro.calcularIpva();
        System.out.println(ipva);
        //seuCarro.calcularValorRevenda();


//        meuCarro.proprietario = pessoa1;
//        seuCarro.proprietario = pessoa1;
//
//
//
//        System.out.println(meuCarro.proprietario.nome);
//        System.out.println(seuCarro.proprietario.nome);
//        System.out.println(meuCarro.proprietario.nome);
//        System.out.println(meuCarro.fabricante);
//        System.out.println(meuCarro.modelo);
//        System.out.println("-------------------------------------");
//        System.out.println(seuCarro.proprietario.nome);
//        System.out.println(seuCarro.fabricante);
//        System.out.println(seuCarro.modelo);







    }
}
