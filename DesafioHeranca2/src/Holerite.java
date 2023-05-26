public record Holerite(String nome, String mesAno, double valorSalario) {


    public void imprimir(){
        System.out.println(nome());
        System.out.println(mesAno());
        System.out.println(valorSalario());
    }
}
