public class PetShopp {
    public static void main (String[] args){
        Cachorro cachorro = new Cachorro();

        cachorro.idade = 3;
        cachorro.nome = "Rodolfo";
        cachorro.raca = "Beagle";
        cachorro.sexo = "Hemafrodita";

        Proprietario eu = new Proprietario();
        eu.nomeProprietario = "Binhaca";
        eu.cpf = "234.342.453-89";
        eu.dataNascimento = "06-12-1996";

        System.out.printf("Nome Proprietario: %s%n", eu.nomeProprietario);
        System.out.printf("CPF Proprietario: %s%n", eu.cpf);
        System.out.printf("Data de Nascimento do Proprietario: %s%n", eu.dataNascimento);

        System.out.printf("Nome: %s%n", cachorro.nome);
        System.out.printf("Sexo: %s%n", cachorro.sexo);
        System.out.printf("Raça: %s%n", cachorro.raca);
        System.out.printf("Idade: %d%n", cachorro.idade);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println();

        Cachorro cachorro2 = new Cachorro();

        cachorro2.idade = 5;
        cachorro2.nome = "Mila";
        cachorro2.raca = "Rottweiler";
        cachorro2.sexo = "Femea";

        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Idade: %d%n", cachorro2.idade);
    }
}
