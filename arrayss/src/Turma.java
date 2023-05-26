import java.util.Arrays;

public class Turma {
    String turma;
    Alunos[] alunos = new Alunos[0];

    void adicionar(Alunos aluno){
        alunos = Arrays.copyOf(alunos, alunos.length + 1);
        alunos[alunos.length -1] = aluno;
    }

    void imprimir(){
        for (Alunos aluno : alunos){
            System.out.println(aluno.nome +" "+ aluno.idade);

        }
    }
}
