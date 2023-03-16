import java.util.LinkedList;

public class Aula {

    private String name;
    private int num;
    private String summary;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula() {
    }

    public Aula(String name, int num) {
        this.name = name;
        this.num = num;
        this.summary = "";
        this.professor = null;
        this.alunos = new LinkedList<>();
    }

    //Funcoes para adicionar e retirar professores
    public void addProfessor(Professor professor){
        this.professor = professor;
    }

    public void removeProfessor(){
        this.professor = null;
    }

    public void setProfessor(){

        if(this.professor == professor){
            return;
        }

        if(this.professor != null) {
            this.professor.remover(this); //errado dar fix este fim de semana
        }

            this.professor = professor;
            this.professor.adicionarProfessor(this);
    }

    public void getProfessor(){

    }

    //Funcoes para adicionar e retirar alunos
    public void addAluno(Aluno aluno){
        this.alunos = aluno;
    }

    public void removeAluno(){
        this.alunos = null;
    }

    //Funcoes para adicionar e retirar o sumário
    public void addSummary(){

    }

    public String clearSummary(){

    }
}