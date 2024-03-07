package modelo;

import java.util.LinkedList;

public class Aula {
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.alunos = new LinkedList<>();
        this.professor = null;
        this.sumario = "";
    }

    public void adicionarAluno(Aluno aluno){

    }
}
