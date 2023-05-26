import java.util.Arrays;

public class Turma {

    String turma;
    String nomeProfessora;

    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno){ //pega o array anterior e atribui uma nova posição
        alunos = Arrays.copyOf(alunos, alunos.length + 1);
        alunos[alunos.length -1] = aluno;

    }

    //abordagem com o for sem a variavel de controle
    void imprimirResumo(){
        for (Aluno aluno : alunos){
            if (aluno != null){
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            }
        }
    }

}
