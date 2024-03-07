package modelo;

import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;


    public Professor(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    public void preencherSumario(Aula aula){
        System.out.println(this.nome);
    };
}
