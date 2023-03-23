package Modelo;

import java.util.LinkedList;

public class Aluno {

    private String nome;
    private long numero;
    private LinkedList<Aula> aula;

    public Aluno(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
        aula = new LinkedList<>();
    }

    public void preencherSumario(Aula aula1) {
        aula1.adicionarLinhaSumario(nome);
    }

    public void adicionar(Aula aula1) {
        if (aula1 == null || aula.contains(aula1)) {
            return;
        }
        aula.add(aula1);
        aula1.adicionar(this);
    }

    public String getNome() {
        return this.nome;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void remover(Aula aula1) {
        if (aula1 == null || !aula.contains(aula1)) {
            return;
        }
        aula.remove(aula);
        aula1.remover(this);
    }
}
