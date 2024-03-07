package modelo;

import java.util.LinkedList;

public class Aluno {
    String nome;
    long numero;
    LinkedList<Aula> aulas;

    public Aluno(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    public void preencherSumario(Aula aula){

    };
}
