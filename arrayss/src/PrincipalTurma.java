public class PrincipalTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.turma = "segunda serie";

        Alunos aluno1 = new Alunos();
        aluno1.nome = "rodolfo";
        aluno1.idade = 3;

        Alunos aluno2 = new Alunos();
        aluno2.nome = "Carpachio";
        aluno2.idade = 4;

//        turma.alunos = new Alunos[2];
//        turma.alunos[0] = aluno1;
//        turma.alunos[1] = aluno2;

        turma.adicionar(aluno1);
        turma.adicionar(aluno2);


        turma.imprimir();


//        for (Alunos nome : turma.alunos){
//            System.out.println(nome.nome +" "+ nome.idade);
//
//        }

//        for (int i = 0; i < turma.alunos.length; i++){
//            System.out.println(turma.alunos[i].nome);
//        }

//        System.out.println(turma.alunos[0].nome);
//        System.out.println(turma.alunos[1].nome);
    }
}
