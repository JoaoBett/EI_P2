package Modelo;

import java.util.LinkedList;

public class Professor {

    private String nome;
    private long numero;
    private LinkedList<Aula> aula;

    public Professor(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
        aula = new LinkedList<>();
    }

    public void preencherSumario(Aula aula1) {
        aula1.adicionarLinhaSumario(aula1.getNome());
        aula1.adicionarLinhaSumario(String.valueOf(aula1.getNumero()));
        aula1.adicionarLinhaSumario(nome);
    }

    public void adicionar(Aula aulas) {
        if (aulas == null || aula.contains(aulas)) {
            return;
        }
        aula.add(aulas);
        aulas.setProfessor(this);
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

    public void remover(Aula aulas) {
        if (aulas == null || aula.contains(aulas)) {
            return;
        }
        aula.remove(aulas);
        aulas.desassociarProfessor();
    }

    public void desassociarProfessor() {
        //fazer
    }

    public LinkedList<Aula> getAula(){
        return new LinkedList<>(aula);
    }

    public LinkedList<Aula> getAulas(Horario horario){
        return null;
    }

}
