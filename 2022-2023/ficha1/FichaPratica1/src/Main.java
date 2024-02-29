public class Main {
    public static void main(String[] args) {

        //Atribuições dos alunos
        Aluno aluno1 = new Aluno("Joao Silva", 1234);
        Aluno aluno2 = new Aluno("Maria Silva", 6842);
        Aluno aluno3 = new Aluno("Pedro Ferreira", 2581);
        Aluno aluno4 = new Aluno("José Manuel", 4275);
        Aluno aluno5 = new Aluno("Tiago José", 14963);

        //Atribuições dos professores
        Professor professor1 = new Professor("Pedro Fernandes", 1);
        Professor professor2 = new Professor("José Fernandes", 2);

        //Atribuições das aulas
        Aula aula1 = new Aula("Programacao 1", 1);
        Aula aula2 = new Aula("Programacao 2", 2);

        //Adicionar cada professor a uma aula
        aula1.addProfessor(professor1);
        aula2.addProfessor(professor2);

        //Colocar cada aluno numa aula
        aula1.addAluno(aluno1);
        aula1.addAluno(aluno2);
        aula2.addAluno(aluno3);

        aula2.addAluno(aluno1);
        aula2.addAluno(aluno4);
        aula2.addAluno(aluno5);


        //Mostrar as informações da aula
        //aula1.showAula(aluno1);

        //Sumário da aula
        aula1.addSummary();

    }
}