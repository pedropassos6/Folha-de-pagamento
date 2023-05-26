import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    void removerAluno(int indice){
        alunos.remove(indice);
    }

    void imprimir(){
        for (Aluno aluno : alunos){
            System.out.println(aluno.nome + " - " + aluno.idade + " anos");
        }
    }

}
