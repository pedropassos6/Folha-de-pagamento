public class Principal {
    public static void main(String[] args) {

        Turma turma = new Turma();
        turma.turma = "Maternal";
        turma.nomeProfessora = "McCaullin";
//        turma.alunos = new Aluno[];

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Binhaca";
        aluno1.idade = 25;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.idade = 15;

//        turma.alunos[1] = aluno1;

//        turma.alunos[0] = new Aluno();
//        turma.alunos[0].nome = "Pedrinho";
//        turma.alunos[0].idade = 29;
//
//        turma.alunos[2] = new Aluno();
//        turma.alunos[2].nome = "Carlitos";
//        turma.alunos[2].idade = 32;

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        turma.imprimirResumo();

//        for (int i = 0; i < turma.alunos.length; i++){
//            if (turma.alunos[i] != null) {
//                System.out.printf("%d - %s (%d anos)%n", i, turma.alunos[i].nome, turma.alunos[i].idade);
//            }
//        }



    }
}
