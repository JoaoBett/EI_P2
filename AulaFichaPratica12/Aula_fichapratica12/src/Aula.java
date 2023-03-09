import java.util.LinkedList;

public class Aula {

    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> aluno;

    public Aula(String nome,long numero){
        this.nome = nome;
        this.numero = numero;
        this.sumario = "";
        this.professor = null;
        aluno = new LinkedList<>();
    }

    public void adicionarLinhaSumario(){

    }

    public void atribuirProfessor(){


    }

    public void adicionarAluno(){


    }
}
