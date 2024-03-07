import modelo.Aluno;
import modelo.Aula;
import modelo.Professor;

public class Main {
    public static void main(String[] args) {

        //Professores
        Professor professor1 = new Professor("João", 1);
        Professor professor2 = new Professor("Pedro", 2);

        //Aulas
        Aula aula1 = new Aula("P2 TP1", 2);
        Aula aula2 = new Aula("P2 PL9", 2);

        //Alunos
        Aluno aluno1 = new Aluno("Tiago",2221234);
        Aluno aluno2 = new Aluno("Luis",2231234);

        professor1.preencherSumario(aula1);
        professor2.preencherSumario(aula2);

        aluno1.preencherSumario(aula1);
        aluno2.preencherSumario(aula1);
    }
}