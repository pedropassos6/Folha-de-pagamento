public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "pedro";
        aluno.idade = 12;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Binhaca";
        aluno1.idade = 11;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "beatis";
        aluno2.idade = 7;

        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno);

        turma.removerAluno(1);

        turma.imprimir();

    }
}
