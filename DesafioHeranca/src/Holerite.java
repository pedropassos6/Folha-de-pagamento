public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir(){
        System.out.println("Nome: " +nome);
        System.out.println("Data: " +mesAno);
        System.out.println("Salario: " +valorSalario);
    }

}
